package com.techelevator.reservations.dao;


import com.techelevator.reservations.model.Reservation;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcReservationDao implements ReservationDao {
    private JdbcTemplate jdbcTemplate;
    private HotelDao hotelDao;

    private List<Reservation> reservations = new ArrayList<>();

    public JdbcReservationDao(HotelDao hotelDao, JdbcTemplate jdbcTemplate) {
        this.hotelDao = hotelDao;
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Reservation> findAll() {
        List<Reservation> reservations = new ArrayList<>();
        String sql = "SELECT city_id, city_name, state_abbreviation, population, area " +
                "FROM city; ";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            reservations.add(mapRowToReservation(results));
        }
        return reservations;
    }

    @Override
    public List<Reservation> findByHotel(int hotelID)  {
        List<Reservation> hotelReservations = new ArrayList<>();
        boolean hotelExists = false;

        String sql = "SELECT reservation_id, hotel_id, full_name, checkin_date, checkout_date, guests " +
                "FROM reservation " +
                "WHERE hotel_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, hotelID);
        while (results.next()) {
            hotelReservations.add(mapRowToReservation(results));

        }

        return hotelReservations;
    }

    @Override
    public Reservation get(int reservationID) {
        Reservation reservation = null;

        String sql = "SELECT reservation_id, hotel_id, full_name, checkin_date, checkout_date, guests " +
                "FROM reservation " +
                "WHERE reservation_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, reservationID);
        if (results.next()) {
            reservation = (mapRowToReservation(results));

        }
        return reservation;
    }

    @Override
    public Reservation create(Reservation reservation, int hotelID) {
        String sql = "INSERT INTO reservation (hotel_id, full_name, checkin_date, checkout_date, guests) " +
                "VALUES (?, ?, ?, ?, ?) RETURNING reservation_id;";  //RETURNING reservation_id;
        Integer reservationID = jdbcTemplate.queryForObject(sql, Integer.class,
                reservation.getHotelId(), reservation.getFullName(), reservation.getCheckinDate(), reservation.getCheckoutDate(), reservation.getGuests());
        return get(reservationID);
    }

    @Override
    public Reservation update(Reservation reservation, int id)  {
        String sql = "UPDATE reservation " +
                "SET hotel_id = ?, full_name = ?, checkin_date = ?, checkout_date = ?, guests = ?" +
                "WHERE reservation_id = ?;";
        jdbcTemplate.update(sql, reservation.getHotelId(), reservation.getFullName(), reservation.getCheckinDate(),
                reservation.getCheckoutDate(), reservation.getGuests(), reservation.getId());

        return get(id);
    }

    @Override
    public void delete(int id)  {
        String sql = "DELETE FROM reservation WHERE reservation_id = ?;";
        jdbcTemplate.update(sql, id);

    }



    private Reservation mapRowToReservation(SqlRowSet rs) {

        Reservation reservation = new Reservation(rs.getInt("reservation_id"), rs.getInt("hotel_id"), rs.getString("full_Name"), rs.getString("checkin_date"), rs.getString("checkout_date"), rs.getInt("guests"));

        return reservation;
    }
}


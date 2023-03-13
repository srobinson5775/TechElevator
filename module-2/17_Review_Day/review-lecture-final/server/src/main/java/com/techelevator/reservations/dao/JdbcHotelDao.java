package com.techelevator.reservations.dao;

import com.techelevator.reservations.model.Address;
import com.techelevator.reservations.model.Hotel;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcHotelDao implements HotelDao {

    private JdbcTemplate jdbcTemplate;



    public JdbcHotelDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Hotel get(int id) {
        Hotel hotel = null;
        String sql = "SELECT h.hotel_id, h.name, h.stars, h.rooms_available, h.cover_image, h.cost_per_night, " +
                "a. address_id, a.address, a.address2, a.city, a.state, a.zip " +
                "FROM hotel h " +
                "LEFT JOIN address a ON a.address_id = h.address_id " +  //used left join as create hotel does not require and address
                "WHERE hotel_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
        if (results.next()) {
            hotel = mapRowToHotel(results);
        }
        return hotel;
    }

    @Override
    public List<Hotel> list() {
        List<Hotel> hotels = new ArrayList<>();
        String sql = "SELECT h.hotel_id, h.name, h.stars, h.rooms_available, h.cover_image, h.cost_per_night, " +
                "a.address_id, a.address, a.address2, a.city, a.state, a.zip " +
                "FROM hotel h " +
                "INNER JOIN address a ON a.address_id = h.address_id;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()) {
            Hotel hotel = mapRowToHotel(results);
            hotels.add(hotel);
        }
        return hotels;

    }

    @Override
    public List<Hotel> getFilteredList(String state, String city) {
        final String SQL_WHERE_CITY_STATE = "WHERE a.city = ? AND a.state = ?;";
        final String SQL_WHERE_CITY = "WHERE a.city = ?;";
        final String SQL_WHERE_STATE = "WHERE a.state = ?;";
        List<Hotel> hotels = new ArrayList<>();
        SqlRowSet results = null;
        String sql = "SELECT h.hotel_id, h.name, h.stars, h.rooms_available, h.cover_image, h.cost_per_night, " +
                "a.address_id, a.address, a.address2, a.city, a.state, a.zip " +
                "FROM hotel h " +
                "INNER JOIN address a ON a.address_id = h.address_id ";
        if( state!= null && !state.isEmpty() && city != null && !city.isEmpty()) {
            sql += SQL_WHERE_CITY_STATE;
            results = jdbcTemplate.queryForRowSet(sql, state, city);
        }
        else if( state!= null && !state.isEmpty() ) {
            sql += SQL_WHERE_STATE;
            results = jdbcTemplate.queryForRowSet(sql, state);
        }
        else if( city != null && !city.isEmpty()) {
            sql += SQL_WHERE_CITY;
            results = jdbcTemplate.queryForRowSet(sql, city);
        }
        else{
            results = jdbcTemplate.queryForRowSet(sql);
        }

        while(results.next()) {
            Hotel hotel = mapRowToHotel(results);
            hotels.add(hotel);
        }
        return hotels;

    }

    @Override
    public void create(Hotel hotel) {
        String sql = "INSERT INTO hotel (name, stars, rooms_available, cost_per_night, address_id) " +
                "VALUES (?, ?, ?, ?, ?) RETURNING hotel_id;";  //RETURNING city_id;
        Integer hotelId = jdbcTemplate.queryForObject(sql, Integer.class,
                hotel.getName(), hotel.getStars(), hotel.getRoomsAvailable(), hotel.getCostPerNight(), 1);

        //return get(hotelId);
    }

    private Hotel mapRowToHotel(SqlRowSet rs) {

        Hotel hotel = new Hotel(rs.getInt("hotel_Id"), rs.getString("name"), new Address(), rs.getInt("stars"), rs.getInt("rooms_available"), rs.getDouble("cost_per_night"));

        Address address = new Address();

        address.setId(rs.getString("address_id"));
        address.setAddress(rs.getString("address"));
        address.setAddress2(rs.getString("address2"));
        address.setCity(rs.getString("city"));
        address.setState(rs.getString("state"));
        address.setZip(rs.getString("zip"));

        hotel.setAddress(address);

        return hotel;
    }
}

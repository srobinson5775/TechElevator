package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/hotels")--you would not need to identify hotels in your paths below. just {id} for example
public class HotelController {


    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public HotelController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDao.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDao.get(id);
    }

    /**
     * Returns all reservations in the system
     *
     * @return all reservations
     */

    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<Reservation> ListReservations() {
        return reservationDao.findAll();
    }

    /**
     * Get a reservation by its id
     *
     * @param id
     * @return a single reservation
     */
    @RequestMapping(path = "/reservations/{id}", method = RequestMethod.GET)
    public Reservation getReservation(@PathVariable int id) {
        return reservationDao.get(id);
    }

    /**
     * list all reservations by hotel
     *
     * @param id
     * @return list of all reservations in the system by hotel
     */


    @RequestMapping(path = "/hotels/{id}/reservations", method = RequestMethod.GET)
    public List<Reservation> reservations(@PathVariable int id) {
        return reservationDao.findByHotel(id);
    }

    /**
     * Create a new reservation for a given hotel
     *
     * @param reservation
     */
    @RequestMapping(path = "/reservations", method = RequestMethod.POST)
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationDao.create(reservation, reservation.getHotelId());
    }

    /**
     * /hotels?state={state}&city={city}
     *
     * @param state the state to filter by
     * @param city the city to filter by
     * @return a list of hotels that match the city & state
     */

    @RequestMapping(path = "/hotelsfiltered", method = RequestMethod.GET)
    public List<Hotel> filterByStateAndCity (@RequestParam (required = false) String state, @RequestParam(required = false) String city){
        return hotelDao.getFilteredList(state, city);
    }

    //@requestParam (required = false) how to make params optional
}
//list all reservations by hotel
//path:/hotels/{id}/reservations
//request method: GET
//return: list of all reservations in the system by hotel


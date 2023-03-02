package com.techelevator.reservations.dao;

import com.techelevator.reservations.model.Hotel;

import java.util.List;

public interface HotelDao {

    List<Hotel> list();

    List<Hotel> getFilteredList(String state, String city);

    void create(Hotel hotel);

    Hotel get(int id);

}
package com.techelevator.hotels.services;

import com.techelevator.hotels.model.City;
import com.techelevator.hotels.model.Hotel;
import com.techelevator.hotels.model.Review;
import org.springframework.web.client.RestTemplate;

public class HotelService {

    private static final String API_BASE_URL = "http://localhost:3000/";
    private final RestTemplate restTemplate = new RestTemplate();

    public Hotel[] listHotels() {
        Hotel[] hotels = restTemplate.getForObject(API_BASE_URL + "hotels", Hotel[].class);
        return hotels;

    }

    public Review[] listReviews() {
        Review[] reviews = restTemplate.getForObject(API_BASE_URL + "reviews", Review[].class);
        return reviews;
    }

    public Hotel getHotelById(int id) {

        Hotel hotel = restTemplate.getForObject(API_BASE_URL + "hotels/" + id, Hotel.class);
        return hotel;
    }

    public Review[] getReviewsByHotelId(int hotelId) {
        Review[] reviews = restTemplate.getForObject(API_BASE_URL + "hotels/" + hotelId + "/reviews", Review[].class);
        return reviews;
    }

    public Hotel[] getHotelsByStarRating(int stars) {
        Hotel[] hotels = restTemplate.getForObject(API_BASE_URL + "hotels?stars=" + stars, Hotel[].class);
        return hotels;
    }

    public City getWithCustomQuery(){
        City city = restTemplate.getForObject("https://api.teleport.org/api/cities/geonameid:5128581/", City.class);
        return city;
    }

}

package com.techelevator.hotels.model;

import java.util.Objects;

public class Review {
    private int hotelId;
    private String title;
    private String review;
    private String author;
    private int stars;

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "\n--------------------------------------------" +
                "\n Review Details" +
                "\n--------------------------------------------" +
                "\n Hotel ID: " + hotelId +
                "\n Title: " + title +
                "\n Review: " + review +
                "\n Author: " + author +
                "\n Stars: " + stars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review1 = (Review) o;
        return hotelId == review1.hotelId && stars == review1.stars && title.equals(review1.title) && review.equals(review1.review) && author.equals(review1.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotelId, title, review, author, stars);
    }
}

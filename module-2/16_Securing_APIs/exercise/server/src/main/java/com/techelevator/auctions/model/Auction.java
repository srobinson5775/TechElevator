package com.techelevator.auctions.model;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

public class Auction {

    private int id;
    @NotBlank(message = "The field `title` should not be blank.")
    private String title;
    @NotBlank(message = "The field `description` should not be blank.")
    private String description;
    @NotBlank(message = "The field `user` should not be blank.")
    private String user;
    @DecimalMin(value = "1.0", message = "The field `current bid` should be greater than 0.")
    private double currentBid;

    public Auction() {
    }

    public Auction(String title, String description, String user, double currentBid) {
        this.title = title;
        this.description = description;
        this.user = user;
        this.currentBid = currentBid;
    }

    public Auction(int id, String title, String description, String user, double currentBid) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.user = user;
        this.currentBid = currentBid;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUser() {
        return user;
    }

    public double getCurrentBid() {
        return currentBid;
    }

    public String currentBidToString() {
        return id + ": " + title + " | Current Bid: " + currentBid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setCurrentBid(double currentBid) {
        this.currentBid = currentBid;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auction auction = (Auction) o;
        return id == auction.id && Double.compare(auction.currentBid, currentBid) == 0 && title.equals(auction.title) && description.equals(auction.description) && user.equals(auction.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, user, currentBid);
    }

    @Override
    public String toString() {
        return "Auction{" + "id=" + id + ", title='" + title + '\'' + ", description='" + description + '\''
                + ", user='" + user + '\'' + ", currentBid=" + currentBid + '}';
    }
}

package com.techelevator.model;

import java.time.LocalDate;
import java.util.Objects;

public class Campground {
    private int campgroundId;
    private int parkId;
    private String name;
    private LocalDate openFromMonth;
    private LocalDate openToMonth;
    private int dailyFee;

    public int getCampgroundId() {
        return campgroundId;
    }

    public void setCampgroundId(int campgroundId) {
        this.campgroundId = campgroundId;
    }

    public int getParkId() {
        return parkId;
    }

    public void setParkId(int parkId) {
        this.parkId = parkId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getOpenFromMonth() {
        return openFromMonth;
    }

    public void setOpenFromMonth(LocalDate openFromMonth) {
        this.openFromMonth = openFromMonth;
    }

    public LocalDate getOpenToMonth() {
        return openToMonth;
    }

    public void setOpenToMonth(LocalDate openToMonth) {
        this.openToMonth = openToMonth;
    }

    public int getDailyFee() {
        return dailyFee;
    }

    public void setDailyFee(int dailyFee) {
        this.dailyFee = dailyFee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Campground that = (Campground) o;
        return campgroundId == that.campgroundId && parkId == that.parkId && dailyFee == that.dailyFee && name.equals(that.name) && openFromMonth.equals(that.openFromMonth) && openToMonth.equals(that.openToMonth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campgroundId, parkId, name, openFromMonth, openToMonth, dailyFee);
    }

    @Override
    public String toString() {
        return "Campground{" +
                "campgroundId=" + campgroundId +
                ", parkId=" + parkId +
                ", name='" + name + '\'' +
                ", openFromMonth=" + openFromMonth +
                ", openToMonth=" + openToMonth +
                ", dailyFee=" + dailyFee +
                '}';
    }

    //Override toString(), equals() and hashcode()
}

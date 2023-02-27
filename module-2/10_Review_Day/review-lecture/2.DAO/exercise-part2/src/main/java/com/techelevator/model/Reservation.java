package com.techelevator.model;

import java.time.LocalDate;
import java.util.Objects;

public class Reservation {
    private int reservationId;
    private int siteId;
    private String name;
    private LocalDate fromDate;
    private LocalDate toDateIn;
    private LocalDate createDate;

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDateIn() {
        return toDateIn;
    }

    public void setToDateIn(LocalDate toDateIn) {
        this.toDateIn = toDateIn;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return reservationId == that.reservationId && siteId == that.siteId && name.equals(that.name) && fromDate.equals(that.fromDate) && toDateIn.equals(that.toDateIn) && createDate.equals(that.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservationId, siteId, name, fromDate, toDateIn, createDate);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", siteId=" + siteId +
                ", name='" + name + '\'' +
                ", fromDate=" + fromDate +
                ", toDateIn=" + toDateIn +
                ", createDate=" + createDate +
                '}';
    }

    //Override toString(), equals() and hashcode()
}

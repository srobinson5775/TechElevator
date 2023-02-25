package com.techelevator.model;

import com.techelevator.dao.ParkDao;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Park {
    private int parkId;
    private String parkName;
    private String parkLocation;
    private LocalDate establishDate;
    private int area;
    private int visitors;
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Park park = (Park) o;
        return parkId == park.parkId && area == park.area && visitors == park.visitors && parkName.equals(park.parkName) && parkLocation.equals(park.parkLocation) && establishDate.equals(park.establishDate) && description.equals(park.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parkId, parkName, parkLocation, establishDate, area, visitors, description);
    }

    public int getParkId() {
        return parkId;
    }

    public void setParkId(int parkId) {
        this.parkId = parkId;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public String getParkLocation() {
        return parkLocation;
    }

    public void setParkLocation(String parkLocation) {
        this.parkLocation = parkLocation;
    }

    public LocalDate getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(LocalDate establishDate) {
        this.establishDate = establishDate;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getVisitors() {
        return visitors;
    }

    public void setVisitors(int visitors) {
        this.visitors = visitors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Park{" +
                "parkId=" + parkId +
                ", parkName='" + parkName + '\'' +
                ", parkLocation='" + parkLocation + '\'' +
                ", establishDate=" + establishDate +
                ", area=" + area +
                ", visitors=" + visitors +
                ", description='" + description + '\'' +
                '}';
    }

    //Override toString(), equals() and hashcode()
}

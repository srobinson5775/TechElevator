package com.techelevator.hotels.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class City {

    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("geoname_id")
    private int geonameId;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGeonameId(int geonameId){
        this.geonameId = geonameId;
    }

    public String getFullName(){
        return fullName;
    }

    @Override
    public String toString(){
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return geonameId == city.geonameId && fullName.equals(city.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, geonameId);
    }
}

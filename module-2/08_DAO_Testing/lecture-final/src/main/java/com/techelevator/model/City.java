package com.techelevator.model;

import java.util.Objects;

public class City {

    private int cityId;
    private String cityName;
    private String stateAbbreviation;
    private int population;
    private double area;

    public City() {

    }

    public City(int cityId, String cityName, String stateAbbreviation, int population, double area) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.stateAbbreviation = stateAbbreviation;
        this.population = population;
        this.area = area;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    public void setStateAbbreviation(String stateAbbreviation) {
        this.stateAbbreviation = stateAbbreviation;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return String.format("%s, %s (ID: %d)", getCityName(), getStateAbbreviation(), getCityId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return cityId == city.cityId && population == city.population && Double.compare(city.area, area) == 0 && cityName.equals(city.cityName) && stateAbbreviation.equals(city.stateAbbreviation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityId, cityName, stateAbbreviation, population, area);
    }
}

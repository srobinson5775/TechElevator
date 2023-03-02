package com.techelevator.reservations.model;

import java.util.Objects;
import java.util.UUID;

public class Address {

    private String id;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;

    public Address() {
        setId();
    }

    public Address(String address, String address2, String city, String state, String zip) {
        setId();
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getId() {
        return id;
    }

    private void setId() {
        this.id = UUID.randomUUID().toString();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address1 = (Address) o;
        return id.equals(address1.id) && address.equals(address1.address) && address2.equals(address1.address2) && city.equals(address1.city) && state.equals(address1.state) && zip.equals(address1.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, address2, city, state, zip);
    }
}

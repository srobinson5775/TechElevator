package com.techelevator.crm;

import com.techelevator.Billable;

import java.util.Map;

public class Customer implements Billable {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Customer(String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Customer(String firstName, String lastName){
        super(firstName, lastName);
        this.getPhoneNumber();

    }

    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        return 0;
    }
}

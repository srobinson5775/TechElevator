package com.techelevator.crm;

import com.sun.jdi.Value;
import com.techelevator.Billable;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.security.Key;
import java.security.KeyPair;
import java.util.Map;
import java.util.Set;

public class Customer implements Billable {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Customer(String firstName, String lastName, String phoneNumber) {
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

    public Customer(String firstName, String lastName) {
        new Customer(firstName, lastName, "");

    }

    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double balance = 0.0;
        double totalBalance = 0.0;
        var entryValue =servicesRendered.entrySet();
        double currentValue = 0.0;

        for (var service : entryValue) {
            if (service.getKey() == "Walking") {
                currentValue = service.getValue();
                totalBalance += currentValue;
            } else {
                totalBalance += currentValue;
            }

        }
        return totalBalance;
    }
}
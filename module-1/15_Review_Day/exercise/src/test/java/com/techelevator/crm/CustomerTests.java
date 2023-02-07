package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;


import java.util.Map;



public class CustomerTests {
    @Test

    public void getBalanceDue_Test() {
        Customer customer = new Customer("Tony", "Stark", "305-187-9034");
        Map<String, Double> servicesAndPricesMap = Map.ofEntries(Map.entry("Grooming",20.00), Map.entry("Walking", 30.00));
        double amountDueForWalkingAndGroomingTest = customer.getBalanceDue(servicesAndPricesMap);

        Assert.assertEquals(50.00, amountDueForWalkingAndGroomingTest, 0);

    }
}
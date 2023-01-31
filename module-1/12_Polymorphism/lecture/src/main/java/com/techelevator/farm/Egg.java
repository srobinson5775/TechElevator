package com.techelevator.farm;

import java.math.BigDecimal;

public class Egg implements Sellable{
    private String name;
    private BigDecimal price;

    public Egg(){
        name = "Egg";
        price = new BigDecimal("1.50");
    }

    public String getName(){
        return name;
    }
    public BigDecimal getPrice(){
        return price;
    }
}
//have to make your own get name and price because it does not extend from farm animal
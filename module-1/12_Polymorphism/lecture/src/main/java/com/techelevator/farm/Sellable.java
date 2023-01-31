package com.techelevator.farm;
import java.math.BigDecimal; //recommended for dealing with money

public interface Sellable {
    String getName();
    BigDecimal getPrice();
}

package com.techelevator.calculators;

public class Calculator {

    private double result;

    public Calculator(){

    }


    public Calculator(double result) {

    }


    public Calculator(int result) {

    }



    public double getResult(){
        return result;
    }

    public void reset(){
        result = 0;
    }

    public void enterNumber(double number){
        result = number;
    }

    public double add(double addend){

        return result;
    }

    public double subtract(double subtrahend){

        return result;
    }

    public double multiply(double multiplier){

        return result;
    }

    public double divide(double quotient){

        return result;
    }

}

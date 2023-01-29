package com.techelevator;

public class Elevator {
   private int currentFloor;
   private int numberOfFloors;
   private boolean doorOpen;


    public Elevator(int numberOfFloors){
        this.numberOfFloors = numberOfFloors ;
        this.currentFloor = 1;
    }

    public int getCurrentFloor(){
        return currentFloor;
    }
    public int getNumberOfFloors(){
        return numberOfFloors;
    }
    public boolean isDoorOpen(){
        currentFloor = currentFloor;
        return doorOpen;
    }

    public void openDoor(){
        doorOpen = true;
        currentFloor = currentFloor;
    }
    public void closeDoor(){
        doorOpen = false;
    }
    public void goUp(int desiredFloor){
        if (!doorOpen && desiredFloor > currentFloor && desiredFloor <= numberOfFloors){
            currentFloor = desiredFloor;
        }
    }
    public void goDown(int desiredFloor){
        if (!doorOpen && desiredFloor < currentFloor && desiredFloor > 0) {
            currentFloor = desiredFloor;
        }
    }


}

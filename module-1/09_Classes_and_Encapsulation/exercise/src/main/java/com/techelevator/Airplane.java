package com.techelevator;

public class Airplane {
    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;
    private int AvailableFirstClassSeats;



    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats =totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }
    public String getPlaneNumber(){
        return this.planeNumber;
    }
    public int getTotalFirstClassSeats(){
        return this.totalFirstClassSeats;
    }
    public int getBookedFirstClassSeats(){
        return this.bookedFirstClassSeats;
    }
    public int getTotalCoachSeats(){
        return this.totalCoachSeats;
    }
    public int getBookedCoachSeats(){
        return this.bookedCoachSeats;
    }
    public int getAvailableFirstClassSeats(){
        return this.totalFirstClassSeats;
    }
    public int getAvailableCoachSeats(){
        return this.totalCoachSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats){
        int availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
        int availableCoachSeats = totalCoachSeats- bookedCoachSeats;

        if (forFirstClass && totalFirstClassSeats > bookedFirstClassSeats) {
            totalNumberOfSeats = totalNumberOfSeats + bookedFirstClassSeats;
        } else if (!forFirstClass){
            totalNumberOfSeats = totalNumberOfSeats + bookedCoachSeats;
        }
        return forFirstClass;
    }

}

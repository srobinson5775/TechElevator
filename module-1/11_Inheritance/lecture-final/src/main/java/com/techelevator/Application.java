package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        //Auction generalAuction = new Auction("Tech Elevator t-shirt");

        //generalAuction.placeBid(new Bid("Josh", 1));
        //generalAuction.placeBid(new Bid("Fonz", 23));
        //generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids


//        System.out.println("Starting a Reserve Auction");
//        System.out.println("-----------------");
//
//        ReserveAuction reserveAuction = new ReserveAuction("Tech Elevator Mug", 20);
//        reserveAuction.placeBid(new Bid ("Tony Stark", 2));
//        reserveAuction.placeBid(new Bid ("Bruce Wayne", 10));
//        reserveAuction.placeBid(new Bid ("Joker", 22));


        System.out.println("Starting a Buyout Auction");
        System.out.println("-----------------");

        Auction auction = new ReserveAuction("Tech Elevator Painting", 200);

        auction.placeBid(new Bid ("Tony Stark", 150));
        auction.placeBid(new Bid ("Bruce Wayne", 165));
        auction.placeBid(new Bid ("Joker", 212));
        auction.placeBid(new Bid ("Hulk", 188));


    }
}

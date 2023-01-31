package com.techelevator;


public class ReserveAuction extends Auction {

    private int reservePrice;


    public ReserveAuction(String itemForSale, int reservePrice){
        super(itemForSale);
        this.reservePrice = reservePrice;
    }


    //Override the placeBid method to handle reserve price
    @Override
    public boolean placeBid(Bid offeredBid){
        boolean isCurrentWinningBid = false;
        if(offeredBid.getBidAmount() >= reservePrice) {
            isCurrentWinningBid = super.placeBid(offeredBid); //invokes placeBid method on the super class
        }
        return isCurrentWinningBid;
    }



}

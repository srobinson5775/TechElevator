package com.techelevator;

public class ReserveAuction extends Auction{
//because reserve auction is a tpe of auction we can extend properties and states
    private int reservePrice;




    public ReserveAuction(String itemForSale, int reservePrice){
        super(itemForSale); //calls the parent type for item for sale
        this.reservePrice = reservePrice;
    }

    //Override the placeBid method to handle reserve price and change the behavior
    @Override
    public boolean placeBid(Bid offeredBid){
        boolean isCurrentWinningBid = false;
        if (offeredBid.getBidAmount() >= reservePrice) {
            isCurrentWinningBid = super.placeBid(offeredBid); //invokes placeBid method on the super class
        }
        return isCurrentWinningBid;
    }

}

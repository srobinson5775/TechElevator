package com.techelevator.auctions.service;

import com.techelevator.auctions.model.Auction;

import java.util.List;

public interface AuctionService {

    List<Auction> list(String title, double currentBid);
    public Auction get(int id);
    public Auction create(Auction auction);

}

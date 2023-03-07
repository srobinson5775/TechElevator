package com.techelevator.auctions.service;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class AuctionServiceImpl implements AuctionService {

    private AuctionDao dao;


    public AuctionServiceImpl(AuctionDao auctionDao) {
        this.dao = auctionDao;
    }

    @Override
    public List<Auction> list(String title,double currentBid) {

        if( !title.isEmpty() && currentBid != 0) {
            return dao.searchByTitleAndPrice(title,currentBid);
        }
        else if( !title.isEmpty() ) {
            return dao.searchByTitle(title);
        }
        else if( currentBid != 0) {
            return dao.searchByPrice(currentBid);
        } else {
            return dao.list();
        }

    }


    @Override
    public Auction get(int id) {
        return dao.get(id);
    }

    @Override
    public Auction create(Auction auction) {
        return dao.create(auction);
    }
}

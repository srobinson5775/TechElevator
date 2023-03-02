package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDao();
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Auction> auctionsList(@RequestParam(name = "title_like", defaultValue = "") String title, @RequestParam(name = "currentBid_lte", defaultValue = "0") double currentBidLte){
        if (!title.isEmpty()){
            return dao.searchByTitle(title);
        } else if (title.isEmpty()){
            return dao.list();
        } else if (currentBidLte > 0){
            return dao.searchByPrice(currentBidLte);
        } else return dao.list();

    }

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public Auction getAuction(@PathVariable int id){
        return dao.get(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Auction addAuction(@RequestBody Auction auction){
        return dao.create(auction);
    }

}

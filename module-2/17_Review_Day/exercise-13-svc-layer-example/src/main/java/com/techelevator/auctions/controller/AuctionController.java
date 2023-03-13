package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import com.techelevator.auctions.service.AuctionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionService auctionSvc;

    public AuctionController(AuctionService auctionService) {
        this.auctionSvc = auctionService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Auction> list(@RequestParam( name = "title_like", defaultValue = "") String title,
                              @RequestParam(name = "currentBid_lte", defaultValue = "0") double currentBid) {

        return auctionSvc.list(title, currentBid);

    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
        return auctionSvc.get(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auction) {
        return auctionSvc.create(auction);
    }

}

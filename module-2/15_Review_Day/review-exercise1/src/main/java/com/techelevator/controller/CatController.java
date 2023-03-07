package com.techelevator.controller;

import com.techelevator.dao.CatCardDao;
import com.techelevator.model.CatCard;
import com.techelevator.model.CatFact;
import com.techelevator.model.CatPic;
import com.techelevator.service.CatFactService;
import com.techelevator.service.CatPicService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/cards")
public class CatController {

    private CatCardDao catCardDao;
    private CatFactService catFactService;
    private CatPicService catPicService;

    public CatController(CatCardDao catCardDao, CatFactService catFactService, CatPicService catPicService) {
        this.catCardDao = catCardDao;
        this.catFactService = catFactService;
        this.catPicService = catPicService;
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<CatCard> getAllCards(){
        return catCardDao.list();
    }

    @RequestMapping (path = "{id}", method = RequestMethod.GET)
    public CatCard getCatCardById(@PathVariable long id) {
        CatCard card = catCardDao.get(id);
        if (card == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cat Card not found");
        } else {
            return card;
        }
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST)
    public void saveCatCard(@Valid @RequestBody CatCard cardToSave) {
        catCardDao.save(cardToSave);
    }

    @RequestMapping(path = "/random", method = RequestMethod.GET)
    public CatCard makeNewCard() {
        CatFact fact = catFactService.getFact();
        CatPic pic = catPicService.getPic();
        CatCard card = new CatCard();
        card.setCatFact(fact.getText());
        card.setImgUrl(pic.getFile());
        return card;
    }

    @RequestMapping (path = "{id}", method = RequestMethod.PUT)
    @ResponseStatus (HttpStatus.NO_CONTENT)
    public void updateCatCard(@PathVariable long id, @RequestBody CatCard cardToBeUpdated){
        catCardDao.update(id, cardToBeUpdated);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(path ="{id}", method = RequestMethod.DELETE)
    public void deleteCatCard(@PathVariable long id) {
        catCardDao.delete(id);
    }






}

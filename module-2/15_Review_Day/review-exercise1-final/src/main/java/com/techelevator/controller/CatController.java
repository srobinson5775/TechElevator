package com.techelevator.controller;

import com.techelevator.model.CatCard;
import com.techelevator.dao.CatCardDao;
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

    public CatController(CatCardDao cat, CatFactService catFact, CatPicService catPic) {
        this.catCardDao = cat;
        this.catFactService = catFact;
        this.catPicService = catPic;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CatCard getIndividualCard(@PathVariable long id) {
        CatCard card = catCardDao.get(id);
        if (card == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CatCard not found");
        }
        return catCardDao.get(id);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<CatCard> getAllCards() {
        return catCardDao.list();
    }

    @RequestMapping(value = "/random", method = RequestMethod.GET)
    public CatCard makeNewCard() {
        CatFact fact = catFactService.getFact();
        CatPic pic = catPicService.getPic();
        CatCard card = new CatCard();
        card.setCatFact(fact.getText());
        card.setImgUrl(pic.getFile());
        return card;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "", method = RequestMethod.POST)
    public void saveNewCard(@Valid @RequestBody CatCard incomingCard) {
        catCardDao.save(incomingCard);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateExistingCard(@Valid @RequestBody CatCard changedCard, @PathVariable long id) {
        catCardDao.update(id, changedCard);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteExistingCard(@PathVariable long id) {
        catCardDao.delete(id);
    }
}

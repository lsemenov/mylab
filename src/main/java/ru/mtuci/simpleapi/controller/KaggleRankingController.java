package ru.mtuci.simpleapi.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.mtuci.simpleapi.model.KaggleRanking;
import ru.mtuci.simpleapi.service.KaggleRankingService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = KaggleRankingController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE )
public class KaggleRankingController {
    public static final String REST_URL = "/api/v1/kaggle";

    private final KaggleRankingService kagglerankingService;

    @Autowired
    public KaggleRankingController(KaggleRankingService kagglerankingService) {
        this.kagglerankingService = kagglerankingService;
    }


    @GetMapping(value = "/{id}")
    public KaggleRanking get(@PathVariable("id") Long id) {
        log.info("get" + id);
        return kagglerankingService.get(id);

    }
    @GetMapping
    public List<KaggleRanking> getAll() {
        log.info("getAll");
        return kagglerankingService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public KaggleRanking save(@RequestBody KaggleRanking kaggleRanking) {
        log.info("save" + kaggleRanking);
        return kagglerankingService.save(kaggleRanking);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        log.info("delete" + id);
        kagglerankingService.delete(id);
    }




}
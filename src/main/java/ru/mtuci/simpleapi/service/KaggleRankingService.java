package ru.mtuci.simpleapi.service;

import ru.mtuci.simpleapi.model.KaggleRanking;

import java.util.List;

public interface KaggleRankingService {

    KaggleRanking get(Long id);

    List<KaggleRanking> getAll();

    KaggleRanking save(KaggleRanking kaggleRanking);

    void delete(Long id);



}

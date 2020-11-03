package ru.mtuci.simpleapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mtuci.simpleapi.dao.RankRepository;
import ru.mtuci.simpleapi.model.KaggleRanking;

import java.util.List;

@Service
public class KaggleRankingServiceImpl implements KaggleRankingService {

    private final RankRepository rankRepository;

    @Autowired
    public KaggleRankingServiceImpl(RankRepository rankRepository) {
        this.rankRepository = rankRepository;
    }

    @Override
    public KaggleRanking get(Long id) {
        return rankRepository.findById(id).orElse(null);
    }

    @Override
    public List<KaggleRanking> getAll() {
        return rankRepository.findAll();
    }

    @Override
    public KaggleRanking save(KaggleRanking kaggleRanking) {
        return rankRepository.save(kaggleRanking);
    }

    @Override
    public void delete(Long id) {
        rankRepository.delete(id);
    }
}
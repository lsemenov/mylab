package ru.mtuci.simpleapi;
//Обращение к базе данных через объеекты Java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.mtuci.simpleapi.dao.RankRepository;


@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    private final RankRepository rankRepository;

    @Autowired
    public CommandLineAppStartupRunner(RankRepository rankRepository) {
        this.rankRepository = rankRepository;
    }

    @Override
    public void run(String...args) throws Exception {
        System.out.println(rankRepository.findById(2L).get());
    }
}
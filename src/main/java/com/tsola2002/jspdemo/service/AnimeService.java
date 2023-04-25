package com.tsola2002.jspdemo.service;

import ch.qos.logback.core.read.ListAppender;
import com.tsola2002.jspdemo.model.Anime;
import com.tsola2002.jspdemo.repo.IAnimeRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimeService {

  @Autowired
  IAnimeRepository animeRepo;

  public List<Anime> getAllAnime() {
    List<Anime> animeList = new ArrayList<>();
    animeRepo.findAll().forEach(anime -> animeList.add(anime));

    return animeList;
  }

  public Anime getAnimeById(Long id) {
    return animeRepo.findById(id).get();
  }


}

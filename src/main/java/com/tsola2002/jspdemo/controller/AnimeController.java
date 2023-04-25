package com.tsola2002.jspdemo.controller;

import com.tsola2002.jspdemo.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnimeController {

  @Autowired
  AnimeService animeService;

  @GetMapping({"/", "/viewAnimeList"})
  public String viewAnimeList(Model model) {
    //model.addAttribute("animeList", animeService.getAllAnime());
    model.addAttribute("animeList", animeService.getAllAnime());

    return "ViewAnimeList";
  }

  @GetMapping("/addAnime")
  public String addAnime(Model model) {
    model.addAttribute("anime", animeService.getAllAnime());

    return "ViewAnimeList";
  }
}

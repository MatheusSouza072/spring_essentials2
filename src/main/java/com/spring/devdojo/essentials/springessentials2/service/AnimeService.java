package com.spring.devdojo.essentials.springessentials2.service;

import com.spring.devdojo.essentials.springessentials2.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AnimeService {
    // private final AnimeRepository animeRepository

    private List<Anime> animes = List.of(new Anime(1L,"DBZ"), new Anime(2L,"Berserk"), new Anime(3L,"Berserk"));

    public List<Anime> listAll() {
        return animes;
    }

    public Anime findById(Long id) {
        return animes.stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found"));
    }

}

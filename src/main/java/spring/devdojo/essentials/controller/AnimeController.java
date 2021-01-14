package spring.devdojo.essentials.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import spring.devdojo.essentials.domain.Anime;

@RestController
public class AnimeController {
	public List<Anime> list() {
		return List.of(new Anime("DBZ"), new Anime("Berserk"));
	}
}

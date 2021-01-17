package com.spring.devdojo.essentials.springessentials2.controller;

import com.spring.devdojo.essentials.springessentials2.domain.Anime;
import com.spring.devdojo.essentials.springessentials2.service.AnimeService;
import com.spring.devdojo.essentials.springessentials2.util.DateUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("animes")
@RequiredArgsConstructor
@Log4j2
public class AnimeController {
    @Autowired
    private final DateUtil dateUtil;
    private final AnimeService animeService;

    @ApiOperation(value = "Retornar todos os Cliente", response = AnimeService.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Clientes retornados"),
            @ApiResponse(code = 400, message = "Nenhum cliente existente")

    })
    @GetMapping
    public ResponseEntity<List<Anime>> list() {
        return ResponseEntity.ok(animeService.listAll());
    }
}

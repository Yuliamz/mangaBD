package com.yuliamz.manga.controller;

import com.yuliamz.manga.persistence.entity.MangaEntity;
import com.yuliamz.manga.service.MangaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("manga")
public class MangaController {

    @Autowired
    MangaService mangaService;

    @GetMapping(value = "/porGenero",produces = MediaType.APPLICATION_JSON_VALUE)
    List<MangaEntity> porGenero(@RequestParam Integer genero){
        return mangaService.porGenero(genero);
    }
}

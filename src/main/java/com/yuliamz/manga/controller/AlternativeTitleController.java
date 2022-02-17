package com.yuliamz.manga.controller;

import com.yuliamz.manga.persistence.entity.AlternativeTitleEntity;
import com.yuliamz.manga.service.AlternativeTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("alternative")
public class AlternativeTitleController {

    @Autowired
    AlternativeTitleService alternativeTitleService;

    @GetMapping(value = "/porId",produces = MediaType.APPLICATION_JSON_VALUE)
    AlternativeTitleEntity porGenero(@RequestParam Long mangaId){
        return alternativeTitleService.porId(mangaId);
    }
}

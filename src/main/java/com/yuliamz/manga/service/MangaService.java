package com.yuliamz.manga.service;

import com.yuliamz.manga.persistence.entity.MangaEntity;
import com.yuliamz.manga.persistence.repository.MangaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MangaService {

    @Autowired
    MangaRepository mangaRepository;

    public List<MangaEntity> porGenero(Integer genero) {
        return mangaRepository.porGenero(genero);
    }

}

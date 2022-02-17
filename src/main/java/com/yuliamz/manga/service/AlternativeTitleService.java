package com.yuliamz.manga.service;

import com.yuliamz.manga.persistence.entity.AlternativeTitleEntity;
import com.yuliamz.manga.persistence.repository.AlternativeTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlternativeTitleService {
    @Autowired
    AlternativeTitleRepository alternativeTitleRepository;

    public AlternativeTitleEntity porId(Long mangaID){
        return alternativeTitleRepository.findById(mangaID).orElse(null);
    }


}

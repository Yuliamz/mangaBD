package com.yuliamz.manga.persistence.repository;

import com.yuliamz.manga.persistence.entity.MangaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MangaRepository extends JpaRepository<MangaEntity, Long> {
}

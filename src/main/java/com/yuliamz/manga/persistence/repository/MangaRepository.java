package com.yuliamz.manga.persistence.repository;

import com.yuliamz.manga.persistence.entity.MangaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MangaRepository extends JpaRepository<MangaEntity, Long> {

    @Query("SELECT M FROM MangaEntity M " +
            " JOIN MangaGenreEntity MG ON (M.id=MG.mangaId) " +
            " WHERE MG.genreId=?1")
    List<MangaEntity> porGenero(Integer genero);
}

package com.yuliamz.manga.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "manga_genre", schema = "manga", catalog = "manga")
@IdClass(MangaGenreEntityPK.class)
public class MangaGenreEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "manga_id")
    private Long mangaId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "genre_id")
    private Integer genreId;

}

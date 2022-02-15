package com.yuliamz.manga.persistence.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "author_manga", schema = "manga", catalog = "manga")
@IdClass(AuthorMangaEntityPK.class)
public class AuthorMangaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "author_id")
    private Long authorId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "manga_id")
    private Long mangaId;

}

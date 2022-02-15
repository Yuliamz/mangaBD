package com.yuliamz.manga.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;
@Data
public class MangaGenreEntityPK implements Serializable {
    private Long mangaId;
    private Integer genreId;
}

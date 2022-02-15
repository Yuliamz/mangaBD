package com.yuliamz.manga.persistence.entity;

import lombok.Data;
import java.io.Serializable;
@Data
public class AuthorMangaEntityPK implements Serializable {
    private Long authorId;
    private Long mangaId;
}

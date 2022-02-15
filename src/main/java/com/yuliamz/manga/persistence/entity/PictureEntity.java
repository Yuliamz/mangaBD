package com.yuliamz.manga.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor @EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "picture", schema = "manga", catalog = "manga")
public class PictureEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "manga_id")
    @EqualsAndHashCode.Include
    private Long mangaId;

    @Column(name = "medium")
    private String medium;

    @Column(name = "large")
    private String large;
}

package com.yuliamz.manga.persistence.entity;

import lombok.*;
import javax.persistence.*;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "genre", schema = "manga", catalog = "manga")
public class GenreEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    @EqualsAndHashCode.Include
    private Integer id;
    
    @Column(name = "name")
    private String name;
}

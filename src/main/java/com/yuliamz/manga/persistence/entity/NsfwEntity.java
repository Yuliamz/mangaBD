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
@Table(name = "nsfw", schema = "manga")
public class NsfwEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    @EqualsAndHashCode.Include
    private Integer id;
    
    @Column(name = "name")
    private String name;
}

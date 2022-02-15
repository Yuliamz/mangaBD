package com.yuliamz.manga.persistence.entity;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor @EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "author", schema = "manga")
public class AuthorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    @EqualsAndHashCode.Include
    private Long id;
    
    @Column(name = "name")
    private String name;
}

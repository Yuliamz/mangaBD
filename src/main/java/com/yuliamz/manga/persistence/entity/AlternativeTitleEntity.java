package com.yuliamz.manga.persistence.entity;

import com.yuliamz.manga.utils.converters.ListToStringConverter;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "alternative_title", schema = "manga")
public class AlternativeTitleEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "manga_id", nullable = false)
    @EqualsAndHashCode.Include
    private Long mangaId;
    
    @Column(name = "synonyms")
    @Convert(converter = ListToStringConverter.class)
    private List<String> synonyms;
    
    @Column(name = "english")
    private String english;
    
    @Column(name = "japanese")
    private String japanese;

}

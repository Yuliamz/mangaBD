package com.yuliamz.manga.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "manga", schema = "manga", catalog = "manga")
public class MangaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    @EqualsAndHashCode.Include
    private Long id;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    
    @Column(name = "synopsis")
    private String synopsis;
    
    @Column(name = "mean")
    private Integer mean;
    
    @Column(name = "ranking")
    private Integer ranking;
    
    @Column(name = "popularity")
    private Integer popularity;
    
    @Column(name = "num_list_users")
    private Integer numListUsers;
    
    @Column(name = "num_scoring_users")
    private Integer numScoringUsers;
    
    @Column(name = "num_volumes")
    private Integer numVolumes;
    
    @Column(name = "num_chapters")
    private Integer numChapters;
    
    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    
    @Column(name = "status_id")
    private Integer statusId;
    
    @Column(name = "media_type_id")
    private Integer mediaTypeId;
    
    @Column(name = "nsfw_id")
    private Integer nsfwId;
}

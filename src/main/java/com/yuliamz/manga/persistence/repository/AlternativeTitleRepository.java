package com.yuliamz.manga.persistence.repository;

import com.yuliamz.manga.persistence.entity.AlternativeTitleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlternativeTitleRepository extends JpaRepository<AlternativeTitleEntity, Long> {

}

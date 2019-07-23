package com.productivity.repository;

import com.productivity.entity.MeasureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasureRepository extends JpaRepository<MeasureEntity, Long> {
}

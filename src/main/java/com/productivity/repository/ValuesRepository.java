package com.productivity.repository;

import com.productivity.entity.ValuesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValuesRepository extends JpaRepository<ValuesEntity, Long> {
}

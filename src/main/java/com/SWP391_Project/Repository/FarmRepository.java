package com.SWP391_Project.Repository;

import com.SWP391_Project.model.Entity.FarmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FarmRepository extends JpaRepository<FarmEntity, Long> {
    Optional<FarmEntity> findById(int id);
}

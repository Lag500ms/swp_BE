package com.SWP391_Project.Repository;

import com.SWP391_Project.model.Entity.KoiFishEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KoiFishRepository extends JpaRepository<KoiFishEntity, Long> {
    Optional<KoiFishEntity> findById(int ID);
}

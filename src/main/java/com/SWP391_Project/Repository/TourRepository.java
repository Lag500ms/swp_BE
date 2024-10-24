package com.SWP391_Project.Repository;

import com.SWP391_Project.Repository.Custom.TourRepositoryCustom;
import com.SWP391_Project.model.Entity.TourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TourRepository extends JpaRepository<TourEntity, Long>, TourRepositoryCustom {
    Optional<TourEntity> findById(int id);
}

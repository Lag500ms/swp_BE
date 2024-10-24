package com.SWP391_Project.Repository;


import com.SWP391_Project.model.Entity.FarmEntity;
import com.SWP391_Project.model.Entity.FarmTourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FarmTourRepository extends JpaRepository<FarmTourEntity, Long> {
    List<FarmTourEntity> findAllByFarm(FarmEntity farmEntity);
}

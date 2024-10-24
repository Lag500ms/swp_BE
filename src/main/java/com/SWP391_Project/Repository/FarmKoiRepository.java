package com.SWP391_Project.Repository;

import com.SWP391_Project.model.Entity.FarmEntity;
import com.SWP391_Project.model.Entity.FarmKoiEntity;
import com.SWP391_Project.model.Entity.KoiFishEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FarmKoiRepository extends JpaRepository<FarmKoiEntity, Long> {
    Optional<FarmKoiEntity> findById(Long id);
    List<FarmKoiEntity> findAllByKoiFish(KoiFishEntity koiFish);
    List<FarmKoiEntity> findAllByFarmKoi(FarmEntity farmKoi);
    List<FarmKoiEntity> findByFarmKoiAndKoiFish(FarmEntity farmKoi, KoiFishEntity koiFish);
}
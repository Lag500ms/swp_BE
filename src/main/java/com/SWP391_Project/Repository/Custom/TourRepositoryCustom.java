package com.SWP391_Project.Repository.Custom;

import com.SWP391_Project.model.Entity.TourEntity;
import com.SWP391_Project.model.Request.FindTourRequestDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TourRepositoryCustom {
    Page<TourEntity> findAllTour(FindTourRequestDTO findTourRequestDTO, Pageable pageable);
}

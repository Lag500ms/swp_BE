package com.SWP391_Project.Service;

import com.SWP391_Project.model.Entity.TourEntity;
import com.SWP391_Project.model.Request.FindTourRequestDTO;
import com.SWP391_Project.model.Request.TourDTO;
import com.SWP391_Project.model.Request.TourRequestDTO;
import com.SWP391_Project.model.Response.TourResponseDTO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface TourService {
    TourRequestDTO add(TourRequestDTO tourDTO);
    List<TourRequestDTO> getAll();
    Page<TourResponseDTO> getAllTour(FindTourRequestDTO findTourRequestDTO);
    TourRequestDTO getTourById(Long id);
    TourRequestDTO update(long id, TourRequestDTO tourRequestDTO);
    boolean delete(long id);
}

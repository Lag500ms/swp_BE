package com.SWP391_Project.Service;

import com.SWP391_Project.model.Entity.FarmEntity;
import com.SWP391_Project.model.Request.FarmRequestDTO;

import java.util.List;

public interface FarmService {
     FarmRequestDTO add(FarmRequestDTO farmRequestDTO);
     List<FarmRequestDTO> getAllFarm();
     FarmRequestDTO update(long id, FarmRequestDTO farmRequestDTO);
     boolean deleteFarm(long id);
     FarmRequestDTO getFarm(long id);
}

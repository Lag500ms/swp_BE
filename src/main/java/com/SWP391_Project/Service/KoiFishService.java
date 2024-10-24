package com.SWP391_Project.Service;

import com.SWP391_Project.model.Entity.KoiFishEntity;
import com.SWP391_Project.model.Request.KoiRequestDTO;

import java.util.List;

public interface KoiFishService {
    List<KoiRequestDTO> getAllKoiFish();
    KoiFishEntity add(KoiRequestDTO KoiRequestDTO);
    boolean update(long id, KoiRequestDTO d);
    boolean delete(long id);
    KoiRequestDTO findById(long id);
}

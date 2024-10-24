package com.SWP391_Project.model.Request;

import lombok.*;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Setter
@Getter
public class FarmRequestDTO {
    private int id;
    private String farmName;
    private String location;
    private String description;
    private Time startTime;
    private Time endTime;
    private String image;
    private List<FarmTourRequestDTO> listFarmTour = new ArrayList<>();
    private List<FarmKoiRequestDTO> listFarmKoi = new ArrayList<>();
}

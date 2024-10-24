package com.SWP391_Project.model.Request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@Setter
@Getter
public class KoiRequestDTO {
    private long id;
    private String koiName;
    private String detail;
    private Long price;
    private String image;
    private List<FarmKoiRequestDTO> farmKoiList = new ArrayList<>();
}

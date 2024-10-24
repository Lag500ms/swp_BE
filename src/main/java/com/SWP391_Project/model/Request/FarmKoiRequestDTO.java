package com.SWP391_Project.model.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FarmKoiRequestDTO {
    private long quantity;
    private long farmId;
    private long koiId;
}

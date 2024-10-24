package com.SWP391_Project.model.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="farm_koi")
public class FarmKoiEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="koi_id")
    private KoiFishEntity koiFish;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "farm_id")
    private FarmEntity farmKoi;

    @JoinColumn(name="quantity")
    private long quantity;
}
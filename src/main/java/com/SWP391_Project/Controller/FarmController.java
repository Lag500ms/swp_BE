package com.SWP391_Project.Controller;


import com.SWP391_Project.Service.FarmService;
import com.SWP391_Project.model.Entity.Response;
import com.SWP391_Project.model.Request.FarmRequestDTO;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@SecurityRequirement(name ="api")
@RequestMapping("/api/farm")
public class FarmController {
    @Autowired
    private FarmService farmService;

    @GetMapping
    public ResponseEntity<List<FarmRequestDTO>> getAll() {
        return ResponseEntity.ok(farmService.getAllFarm());
    }

    @PostMapping
    public Response add(@RequestBody FarmRequestDTO farmRequestDTO) {
        FarmRequestDTO newFarmEntity = farmService.add(farmRequestDTO);
        if(newFarmEntity != null) {
            return new Response(true, "Add Farm Successfully", newFarmEntity);
        }else{
            return new Response(false, "Add Farm Fail!", null);
        }
    }



    @PutMapping("{id}")
    public Response updateFarm(@PathVariable long id, @RequestBody FarmRequestDTO farmRequestDTO) {
        FarmRequestDTO updateFarmEntity = farmService.update(id, farmRequestDTO);
        if(updateFarmEntity != null) {
            return new Response(true, "Update Farm Successfully", updateFarmEntity);
        }else{
            return new Response(false, "update Farm Fail!", null);
        }
    }

    @DeleteMapping("{id}")
    public Response update(@PathVariable long id) {
        boolean deleteFarm = farmService.deleteFarm(id);
        if (deleteFarm) {
            return new Response(true, "Farm delete successfully!" , null);
        }
        return new Response(false, "Farm not found", null);
    }

    @GetMapping("{id}")
    public ResponseEntity<FarmRequestDTO> get(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK).body(farmService.getFarm(id));
    }
}


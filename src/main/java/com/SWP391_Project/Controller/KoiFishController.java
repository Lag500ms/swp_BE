package com.SWP391_Project.Controller;

import com.SWP391_Project.Service.KoiFishService;
import com.SWP391_Project.model.Entity.KoiFishEntity;
import com.SWP391_Project.model.Entity.Response;
import com.SWP391_Project.model.Request.KoiRequestDTO;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/koifish")
@SecurityRequirement(name ="api")
public class KoiFishController {
    @Autowired
    private KoiFishService koiFishService;

    @GetMapping
    public ResponseEntity<List<KoiRequestDTO>> getAll() {
        return ResponseEntity.ok(koiFishService.getAllKoiFish());
    }

    @PostMapping
    public Response add(@RequestBody KoiRequestDTO koiRequestDTO) {
        KoiFishEntity koiReq = koiFishService.add(koiRequestDTO);
        if(koiReq != null){
            return new Response(true,"Add KoiFish Successfully!", null);
        }else{
            return new Response(false,"Add KoiFish Failed!", null);
        }
    }
    @PutMapping("{id}")
    public Response update(@PathVariable int id, @RequestBody KoiRequestDTO koiRequestDTO) {
        boolean updateKoiFish = koiFishService.update(id, koiRequestDTO);
        if (updateKoiFish) {
            return new Response(true, "KoiFish update successfully!" , null);
        }
        return new Response(false, "KoiFish not found", null);
    }

    @DeleteMapping("{id}")
    public Response update(@PathVariable long id) {
        boolean deleteKoiFish = koiFishService.delete(id);
        if (deleteKoiFish) {
            return new Response(true, "KoiFish delete successfully!" , null);
        }
        return new Response(false, "KoiFish not found", null);
    }

    @GetMapping("{id}")
    public ResponseEntity<KoiRequestDTO> get(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK).body(koiFishService.findById(id));
    }

}

package com.example.recruitment_task.geolocation.client;

import com.example.recruitment_task.geolocation.entity.GeolocationLog;
import com.example.recruitment_task.geolocation.models.GeolocationLogDTO;
import com.example.recruitment_task.geolocation.service.GeolocationLogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/geolocationLog")
public class GeolocationLogController {

    private final GeolocationLogService geolocationLogService;

    @PostMapping("/add")
    public GeolocationLog addGeolocationLog(@RequestBody GeolocationLogDTO geolocationLogDTO){
        return geolocationLogService.addGeolocationLog(geolocationLogDTO);
    }

    @GetMapping("/getAll")
    public List<GeolocationLog> getAllGeolocationLog(){
        return geolocationLogService.getAllGeolocationLog();
    }



}

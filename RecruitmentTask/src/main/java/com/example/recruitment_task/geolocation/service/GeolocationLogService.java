package com.example.recruitment_task.geolocation.service;

import com.example.recruitment_task.geolocation.entity.GeolocationLog;
import com.example.recruitment_task.geolocation.models.GeolocationLogDTO;
import com.example.recruitment_task.geolocation.repository.GeolocationLogRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class GeolocationLogService {

    @Autowired
    GeolocationLogRepository geolocationLogRepository;

    public GeolocationLog addGeolocationLog(GeolocationLogDTO geolocationLogDTO) {




        return geolocationLogRepository.save(GeolocationLog.of(geolocationLogDTO));
    }

    public List<GeolocationLog> getAllGeolocationLog(){
        return geolocationLogRepository.findAll();
    }
}

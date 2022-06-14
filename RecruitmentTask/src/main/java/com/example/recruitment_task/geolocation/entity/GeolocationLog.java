package com.example.recruitment_task.geolocation.entity;

import com.example.recruitment_task.geolocation.models.GeolocationLogDTO;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@Setter
@Entity
public class GeolocationLog {

    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name="ID",updatable = false,nullable = false, unique = true)
    private UUID geolocationLogId;

    @Column
    private Long deviceID;

    @Column
    private Long latitude;

    @Column
    private Long longitude;


    public static GeolocationLog of(GeolocationLogDTO geolocationLogDTO){
        return GeolocationLog.builder()
                .deviceID(geolocationLogDTO.getDeviceId())
                .latitude(geolocationLogDTO.getLatitude())
                .longitude(geolocationLogDTO.getLongitude())
                .build();
    }
}

package com.example.recruitment_task.geolocation.models;

import lombok.*;




@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeolocationLogDTO {

    private Long deviceId;
    private Long latitude;
    private Long longitude;
}

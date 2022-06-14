package com.example.recruitment_task.geolocation.service;

import com.example.recruitment_task.geolocation.entity.GeolocationLog;
import com.example.recruitment_task.geolocation.models.GeolocationLogDTO;
import com.example.recruitment_task.geolocation.repository.GeolocationLogRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GeolocationLogServiceTest {


  @Autowired
  private GeolocationLogService geolocationLogService;


  @Test
  public void should_store_a_geolocation_log(){
    GeolocationLogDTO geolocationLogDTO= new GeolocationLogDTO(123L,123L,123L);

    GeolocationLog givenGeolocationLog=GeolocationLog.of(geolocationLogDTO);

    GeolocationLog createdGeolocationLog= geolocationLogService.addGeolocationLog(geolocationLogDTO);

    assertThat(createdGeolocationLog.getDeviceID()).isSameAs(givenGeolocationLog.getDeviceID());
    assertThat(createdGeolocationLog.getLatitude()).isSameAs(givenGeolocationLog.getLatitude());
    assertThat(createdGeolocationLog.getLongitude()).isSameAs(givenGeolocationLog.getLongitude());
  }



}

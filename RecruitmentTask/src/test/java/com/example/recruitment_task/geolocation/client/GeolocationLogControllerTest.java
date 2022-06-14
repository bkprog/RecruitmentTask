package com.example.recruitment_task.geolocation.client;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class GeolocationLogControllerTest {


    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }



    @Test
    public void return_OK_200_http_status() throws Exception {
        //when && then
        mockMvc.perform(get("/api/geolocationLog/getAll"))
                .andExpect(status().isOk());
    }

    @Test
    public void return_OK_200_http_status_for_adding_geolocation_log() throws Exception {

        String jsonBody="{\"deviceId\":\"12345\"," +
                " \"latitude\": \"505430\"," +
                " \"longitude\": \"1423412\"}";
        //when && then
        mockMvc.perform(post("/api/geolocationLog/add")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonBody)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.deviceID").value(12345))
                .andExpect(jsonPath("$.latitude").value(505430))
                .andExpect(jsonPath("$.longitude").value(1423412));


    }




}

package com.example.recruitment_task.geolocation.repository;

import com.example.recruitment_task.geolocation.entity.GeolocationLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GeolocationLogRepository extends JpaRepository<GeolocationLog, UUID> {
}

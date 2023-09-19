package com.trm.vehicletracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trm.vehicletracking.model.TripLog;


public interface TripLogRepository extends JpaRepository<TripLog, Integer> {

}

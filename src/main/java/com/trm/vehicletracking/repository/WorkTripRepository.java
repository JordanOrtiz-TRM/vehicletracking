package com.trm.vehicletracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trm.vehicletracking.model.WorkTrip;


public interface WorkTripRepository extends JpaRepository<WorkTrip, Integer> {

}

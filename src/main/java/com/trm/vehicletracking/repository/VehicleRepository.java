package com.trm.vehicletracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trm.vehicletracking.model.Vehicle;


public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}

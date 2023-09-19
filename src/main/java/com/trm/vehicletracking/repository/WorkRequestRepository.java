package com.trm.vehicletracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trm.vehicletracking.model.WorkRequest;


public interface WorkRequestRepository extends JpaRepository<WorkRequest, Integer> {

}

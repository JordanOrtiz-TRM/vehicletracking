package com.trm.vehicletracking.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "vehicle")
@Entity
public class Vehicle {
  public Vehicle() {
    super();
  }
  
  public Vehicle(String name, Set<WorkTrip> tags) {
    super();
    this.name = name;
    this.tags = tags;
  }


  public Vehicle(String name) {
    super();
    this.name = name;
  }


  @Id
  @Column(name = "vehicleid", nullable = false, columnDefinition = "BIGINT")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int vehicleid;
  
  @Column(name = "name", nullable = false, length = 128)
  public String name;
  
  @OneToMany(mappedBy = "vehicle")
  private Set<WorkTrip> tags = new HashSet<>();

  
  public int getVehicleid() {
    return vehicleid;
  }

  
  public void setVehicleid(int vehicleid) {
    this.vehicleid = vehicleid;
  }

  
  public String getName() {
    return name;
  }

  
  public void setName(String name) {
    this.name = name;
  }

  
  public Set<WorkTrip> getTags() {
    return tags;
  }

  
  public void setTags(Set<WorkTrip> tags) {
    this.tags = tags;
  }

}

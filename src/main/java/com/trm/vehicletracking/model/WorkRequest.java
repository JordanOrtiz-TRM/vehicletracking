package com.trm.vehicletracking.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "workrequest")
@Entity
public class WorkRequest {
  
  @Id
  @Column(name = "workrequestid", nullable = false, columnDefinition = "BIGINT")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int workrequestid;
  
  @Column(name = "addresscombined", nullable = true, length = 512)
  private String addresscombined;
  
  @OneToMany(mappedBy = "workrequest")
  Set<WorkTrip> worktrips;

  
  public WorkRequest() {
    super();
    // TODO Auto-generated constructor stub
  }


  public WorkRequest(String addresscombined) {
    super();
    this.addresscombined = addresscombined;
  }


  public WorkRequest(String addresscombined, Set<WorkTrip> worktrips) {
    super();
    this.addresscombined = addresscombined;
    this.worktrips = worktrips;
  }


  public int getWorkrequestid() {
    return workrequestid;
  }

  
  public void setWorkrequestid(int workrequestid) {
    this.workrequestid = workrequestid;
  }

  
  public String getAddresscombined() {
    return addresscombined;
  }

  
  public void setAddresscombined(String addresscombined) {
    this.addresscombined = addresscombined;
  }

  
  public Set<WorkTrip> getWorktrips() {
    return worktrips;
  }

  
  public void setWorktrips(Set<WorkTrip> worktrips) {
    this.worktrips = worktrips;
  }
  


}

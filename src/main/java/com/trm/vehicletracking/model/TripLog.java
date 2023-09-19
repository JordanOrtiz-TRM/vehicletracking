package com.trm.vehicletracking.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table(name = "triplog")
@Entity
public class TripLog {

  @Id
  @Column(name = "triplogid", nullable = false, columnDefinition = "BIGINT")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int      triplogid;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "worktripid", referencedColumnName = "worktripid", nullable = false, unique = false)
  private WorkTrip worktrip;

  @Column(nullable = false, length = 512)
  private String   latitude;

  @Column(nullable = false, length = 512)
  private String   longitude;
  
  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "logtime")
  private Timestamp logtime;

  
  public TripLog(WorkTrip worktrip, String latitude, String longitude, Timestamp logtime) {
    super();
    this.worktrip = worktrip;
    this.latitude = latitude;
    this.longitude = longitude;
    this.logtime = logtime;
  }


  public TripLog() {
    super();
    // TODO Auto-generated constructor stub
  }


  public TripLog(int triplogid, String latitude, String longitude, Timestamp logtime) {
    super();
    this.triplogid = triplogid;
    this.latitude = latitude;
    this.longitude = longitude;
    this.logtime = logtime;
  }


  public int getTriplogid() {
    return triplogid;
  }

  
  public void setTriplogid(int triplogid) {
    this.triplogid = triplogid;
  }

  
  public WorkTrip getWorktrip() {
    return worktrip;
  }

  
  public void setWorktrip(WorkTrip worktrip) {
    this.worktrip = worktrip;
  }

  
  public String getLatitude() {
    return latitude;
  }

  
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  public String getLongitude() {
    return longitude;
  }

  
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  
  public Timestamp getLogtime() {
    return logtime;
  }

  
  public void setLogtime(Timestamp logtime) {
    this.logtime = logtime;
  }

}

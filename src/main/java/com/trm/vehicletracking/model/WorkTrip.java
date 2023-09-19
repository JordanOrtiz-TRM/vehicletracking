package com.trm.vehicletracking.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "worktrip")
@Entity
public class WorkTrip {

  @Id
  @Column(name = "worktripid", nullable = false, columnDefinition = "BIGINT")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int          worktripid;

  @ManyToOne
  @JoinColumn(name = "workrequestid")
  private WorkRequest  workrequest;

  @ManyToOne
  @JoinColumn(name = "vehicleid", nullable=false)
  private Vehicle      vehicle;

  @Column(name = "isactive", nullable = false, columnDefinition = "INTEGER")
  private int          isactive;

  @OneToMany(mappedBy = "worktrip")
  private Set<TripLog> triplogset;

  
  public WorkTrip() {
    super();
    // TODO Auto-generated constructor stub
  }


  public WorkTrip(WorkRequest workrequest, Vehicle vehicle, int isactive) {
    super();
    this.workrequest = workrequest;
    this.vehicle = vehicle;
    this.isactive = isactive;
  }


  public int getWorktripid() {
    return worktripid;
  }

  
  public void setWorktripid(int worktripid) {
    this.worktripid = worktripid;
  }

  
  public WorkRequest getWorkrequest() {
    return workrequest;
  }

  
  public void setWorkrequest(WorkRequest workrequest) {
    this.workrequest = workrequest;
  }

  
  public Vehicle getVehicle() {
    return vehicle;
  }

  
  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  
  public int getIsactive() {
    return isactive;
  }

  
  public void setIsactive(int isactive) {
    this.isactive = isactive;
  }

  
  public Set<TripLog> getTriplogset() {
    return triplogset;
  }

  
  public void setTriplogset(Set<TripLog> triplogset) {
    this.triplogset = triplogset;
  }
}

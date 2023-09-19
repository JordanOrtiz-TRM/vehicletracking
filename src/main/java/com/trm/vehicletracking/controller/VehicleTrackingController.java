package com.trm.vehicletracking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleTrackingController {
  
  @RequestMapping("")
  public String getIndex() {
    return "index";
  }

}

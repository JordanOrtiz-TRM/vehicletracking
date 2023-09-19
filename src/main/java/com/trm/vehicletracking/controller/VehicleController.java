package com.trm.vehicletracking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trm.vehicletracking.model.Vehicle;
import com.trm.vehicletracking.repository.VehicleRepository;

@Controller
@RequestMapping(value = "/vehicles")
public class VehicleController {

  @Autowired
  VehicleRepository vehiclerepo;

  @GetMapping("")
  public String getIndex(Model model) {
    List<Vehicle> vehicles = vehiclerepo.findAll();
    model.addAttribute("vehicles", vehicles);
    return "vehicle/vehicleindex";
  }

  @GetMapping("add")
  public String getAdd(Model model) {
    model.addAttribute("vehicle", new Vehicle());
    return "vehicle/vehicleadd";
  }
  
  @GetMapping("edit/{id}")
  public String getEdit(@PathVariable(value = "id") int id,Model model) {
    Optional<Vehicle> vehicle = vehiclerepo.findById(id);
    if (vehicle.isPresent()) {
      model.addAttribute("vehicle", vehicle.get());
    }
    return "vehicle/vehicleadd";//can probably combine the add/edit template
  }

  @PostMapping("save")
  public String getSave(Vehicle vehicle) {
    vehiclerepo.save(vehicle);
    return "redirect:/vehicles";
  }
  
  @GetMapping("delete/{id}")
  public String getDelete(@PathVariable(value = "id") int id,Model model) {
    vehiclerepo.deleteById(id);
    return "redirect:/vehicles";
  }

}

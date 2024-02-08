package edu.jsp.bus_springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.bus_springbootapp.dto.Passengers;
import edu.jsp.bus_springbootapp.service.PassengersService;

@RestController
public class PassengersController {

	@Autowired
	PassengersService service;

	// Update
	@PutMapping("/updatePassengers")
	public Passengers updatePassengers(@RequestParam int id, @RequestBody Passengers passengers) {
		return service.updatePassengers(id, passengers);
	}

}

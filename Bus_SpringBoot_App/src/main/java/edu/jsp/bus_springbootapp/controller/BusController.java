package edu.jsp.bus_springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.bus_springbootapp.dto.Bus;
import edu.jsp.bus_springbootapp.service.BusService;

@RestController
public class BusController {

	@Autowired
	BusService busService;

	// Insert
	@PostMapping("/savebus")
	public Bus saveBus(@RequestBody Bus bus) {
		return busService.saveBus(bus);
	}

	// Update
	@PutMapping("/updatebus")
	public Bus updateBus(@RequestParam int id, @RequestBody Bus bus) {
		return busService.updateBus(id, bus);
	}

	// Fetch By Id
	@PutMapping("/getById")
	public Bus getById(@RequestParam int id) {
		return busService.getById(id);
	}

	// Delete
	@DeleteMapping("/deleteById")
	public String deleteById(@RequestParam int id) {
		busService.deleteById(id);
		return "Deleted";
	}
}

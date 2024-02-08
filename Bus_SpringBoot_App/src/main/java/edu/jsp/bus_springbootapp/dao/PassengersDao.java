package edu.jsp.bus_springbootapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jsp.bus_springbootapp.dto.Passengers;
import edu.jsp.bus_springbootapp.repository.PassengersRepo;

@Repository
public class PassengersDao {
	@Autowired
	PassengersRepo passengersRepo;

	// Update
	public Passengers updatePassengers(Passengers passengers) {
		return passengersRepo.save(passengers);
	}

	// Fetch By Id
	public Passengers getById(int id) {
		return passengersRepo.findById(id).get();
	}

}

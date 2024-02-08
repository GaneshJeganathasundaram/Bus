package edu.jsp.bus_springbootapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jsp.bus_springbootapp.dto.Bus;
import edu.jsp.bus_springbootapp.repository.BusRepo;

@Repository
public class BusDao {

	@Autowired
	BusRepo busRepo;

	// Insert
	public Bus saveBus(Bus bus) {
		return busRepo.save(bus);
	}

	// Update
	public Bus updateBus(Bus bus) {
		return busRepo.save(bus);
	}

	// Fetch By Id
	public Bus getById(int id) {
		return busRepo.findById(id).get();
	}

	// Delete
	public Bus deleteById(int id) {
		return busRepo.deleteById(id);

	}
}

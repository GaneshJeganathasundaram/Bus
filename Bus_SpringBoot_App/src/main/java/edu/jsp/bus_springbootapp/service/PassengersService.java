package edu.jsp.bus_springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.bus_springbootapp.dao.PassengersDao;
import edu.jsp.bus_springbootapp.dto.Passengers;

@Service
public class PassengersService {
	@Autowired
	PassengersDao passengersDao;

	// Update
	public Passengers updatePassengers(int id, Passengers passengers) {
		Passengers p = passengersDao.getById(id);

		if (p != null) {
			passengers.setId(id);
			passengersDao.updatePassengers(passengers);

			return passengers;
		}
		return null;
	}

}

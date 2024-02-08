package edu.jsp.bus_springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.bus_springbootapp.dao.BusDao;
import edu.jsp.bus_springbootapp.dto.Bus;

@Service
public class BusService {

	@Autowired
	BusDao busDao;

	// Insert
	public Bus saveBus(Bus bus) {
		return busDao.saveBus(bus);
	}

	// Update
	public Bus updateBus(int id, Bus bus) {
		Bus b = busDao.getById(id);

		if (b != null) {
			bus.setId(id);
			busDao.updateBus(bus);

			return bus;
		}
		return null;
	}

	// Fetch By Id
	public Bus getById(int id) {
		return busDao.getById(id);
	}

	// Delete
	public Bus deleteById(int id) {
		return busDao.deleteById(id);
	}
}

package edu.jsp.bus_springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.bus_springbootapp.dto.Bus;

public interface BusRepo extends JpaRepository<Bus, Integer> {
	public Bus deleteById(int id);
}

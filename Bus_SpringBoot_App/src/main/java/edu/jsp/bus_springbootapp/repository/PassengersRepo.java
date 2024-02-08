package edu.jsp.bus_springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.bus_springbootapp.dto.Passengers;

public interface PassengersRepo extends JpaRepository<Passengers, Integer> {

}

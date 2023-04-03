package com.luke.lukelc.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luke.lukelc.model.ReservationEntity;
import com.luke.lukelc.model.ReservationRepository;

@Service
public class ReservationService {
    
    @Autowired
    private ReservationRepository reservationRepository;

    // Retrieve all rows from table and populate list with objects
	public List getAllReservations() {
		List reservations = new ArrayList<>();
	    reservationRepository.findAll().forEach(reservations::add);
		return reservations;
	}

    // Retrieves one row from table based on given id
	public Optional<ReservationEntity> getReservation(String id) {
		return reservationRepository.findById(id);
	}
	
// Inserts row into table 
	public void addReservation(ReservationEntity reservation) {
		reservationRepository.save(reservation);
	}
	
// Updates row in table
	public void updateReservation(String id, ReservationEntity reservation) {
		reservationRepository.save(reservation);
	}
	
// Removes row from table
	public void deleteReservation(String id) {
		reservationRepository.deleteById(id);
	}
}

package com.luke.lukelc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.luke.lukelc.model.ReservationEntity;
import com.luke.lukelc.service.ReservationService;

@Controller
@RequestMapping("/v1")
public class ReservationController {
    @Autowired
	private ReservationService reservationService;
	
// ------------ Retrieve all reservations ------------
@RequestMapping(value = "/reservations", method = RequestMethod.GET)
	public List getAllReservations() {
		return reservationService.getAllReservations();
	}
	
// ------------ Retrieve a reservation ------------
@RequestMapping(value = "/reservations/{id}", method = RequestMethod.GET)
	public Optional<ReservationEntity> getReservation(@PathVariable String id) {
		return reservationService.getReservation(id);
	}
// ------------ Create a reservation ------------
@RequestMapping(value = "/reservations", method =RequestMethod.POST)
	public void addReservation(@RequestBody ReservationEntity reservation) {
		reservationService.addReservation(reservation);
	}
	
// ------------ Update a reservation ------------
@RequestMapping(value = "/reservations/{id}", method = RequestMethod.PUT)
	public void updateReservation(@RequestBody ReservationEntity reservation,@PathVariable String id) {
		reservationService.updateReservation(id, reservation);
	}
	
// ------------ Delete a reservation ------------
@RequestMapping(value = "/reservations/{id}", method = RequestMethod.DELETE)
	public void deleteReservation(@PathVariable String id) {
		reservationService.deleteReservation(id);
	}
}

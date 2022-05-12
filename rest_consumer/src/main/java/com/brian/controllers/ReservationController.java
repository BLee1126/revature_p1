package com.brian.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brian.models.Reservation;
import com.brian.services.OrderService;

@RestController
@RequestMapping("/rsvps")
public class ReservationController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/all")
	public List<Reservation> findAll(){
		return orderService.findAllReservation();
	}
	
	@PostMapping("/create")
	public Reservation createReservation(@RequestBody Reservation reservation) {
		return orderService.saveReservation(reservation);
	}
	
	@PostMapping("/update")
	public Reservation updateReservation(@RequestBody Reservation reservation) {
		return orderService.saveReservation(reservation);
	}
	
	@DeleteMapping("/delete")
	public void deleteReservationById(@RequestParam int id) {
		orderService.deleteReservationById(id);
	}
	
	@GetMapping("/one")
	public Object findOneReservation(@RequestParam Integer id) {
		return orderService.findOneReservation(id);
	}
	
}

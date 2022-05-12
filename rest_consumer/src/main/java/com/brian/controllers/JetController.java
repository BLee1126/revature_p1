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

import com.brian.models.Jet;
import com.brian.services.OrderService;

@RestController
@RequestMapping("/jets")
public class JetController {
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/all")
	public List<Jet> findAll(){
		return orderService.findAllJets();
	}
	
	@PostMapping("/create")
	public Jet createReservation(@RequestBody Jet jet) {
		return orderService.saveJet(jet);
	}
	
	@PostMapping("/update")
	public Jet updateReservation(@RequestBody Jet jet) {
		return orderService.saveJet(jet);
	}
	
	@DeleteMapping("/delete")
	public void deleteJetById(@RequestParam int id) {
		orderService.deleteJetById(id);
	}
	
	@GetMapping("/one")
	public Jet findOneJet(@RequestParam Integer id) {
		return orderService.findOneJet(id);
	}
}

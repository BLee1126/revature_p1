package com.brian.services;
import java.util.List;
import java.util.Optional;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.brian.dto.Reservation;
import com.brian.models.Jet;


@WebService
@Component
public interface OrderService {

	
	public List<Reservation> findAllReservation();
	public Reservation saveReservation(Reservation Reservation);
	public void deleteReservationById(int id);
	public Reservation updateReservation(Reservation reservation);
	public String test();
	public Object findOneReservation(Integer id);
	
	public List<Jet> findAllJets();
	public Jet findOneJet(Integer id);
	public Jet saveJet(Jet jet);
	public void deleteJetById(int Id);
	public Jet updateJet(Jet jet);
	
}
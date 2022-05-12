package com.brian.services;

import java.util.List;
import java.util.Optional;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;

import com.brian.dto.Reservation;
import com.brian.models.Jet;
import com.brian.repository.JetRepository;
import com.brian.repository.ReservationRepository;


@WebService(endpointInterface = "com.brian.services.OrderService")
public class OrderServiceImpl {
	@Autowired
	private ReservationRepository reservationRepository;
	@Autowired
	private JetRepository jetRepository;

	// Sanity check method my soap service works
	@WebMethod
	public String test() {
		return "watch this!";
	}
	// Web Methods for Reservations
	@WebMethod
	public List<Reservation> findAllReservation() {
		return this.reservationRepository.findAll();
	}
	
	@WebMethod
	public Reservation findOneReservation(Integer id) {
		Reservation noRsvp = new Reservation();
		for(Reservation rsvp: reservationRepository.findAll()) {
			if(rsvp.getId() == id) {
				return rsvp;
			}
		}
		
		return noRsvp;
	}

	@WebMethod
	public Reservation saveReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	@WebMethod
	public void deleteReservationById(int Id) {
		reservationRepository.deleteById(Id);

	}

	@WebMethod
	public Reservation updateReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}
	
	// Web Methods for Jets
	@WebMethod
	public List<Jet> findAllJets() {
		return jetRepository.findAll();
	}
	
	@WebMethod
	public Jet findOneJet(Integer id) {
		Jet noJet = new Jet();
		for(Jet jet: jetRepository.findAll()) {
			if(jet.getId() == id) {
				return jet;
			}
		}
		
		return noJet;
	}

	@WebMethod
	public Jet saveJet(Jet jet) {
		return jetRepository.save(jet);
	}

	@WebMethod
	public void deleteJetById(int Id) {
		jetRepository.deleteById(Id);

	}

	@WebMethod
	public Jet updateJet(Jet jet) {
		return jetRepository.save(jet);
	}
}

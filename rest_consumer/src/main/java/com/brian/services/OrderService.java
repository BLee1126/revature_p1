package com.brian.services;

import java.util.List;
import java.util.Optional;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.brian.models.Jet;
import com.brian.models.Reservation;




@WebService(serviceName = "order-service", targetNamespace = "http://services.brian.com/")
@Component
public interface OrderService {
	
	@WebMethod
	public List<Reservation> findAllReservation();
	
	@WebMethod
	public Object findOneReservation(Integer id);
	
	@WebMethod
	public Reservation saveReservation(Reservation reservation);
	@WebMethod
	public void deleteReservationById(int Id);
	@WebMethod
	public Reservation updateReservation(Reservation reservation);
	@WebMethod
	public String test();
	@WebMethod
	public List<Jet> findAllJets();
	@WebMethod
	public Jet findOneJet(Integer id);
	@WebMethod
	public Jet saveJet(Jet jet);
	@WebMethod
	public void deleteJetById(int Id);
	@WebMethod
	public Jet updateJet(Jet jet);
	
	
}

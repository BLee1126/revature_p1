package com.brian.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.brian.dto.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository("reservationRepository")
public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
	
	List<Reservation> findAll();
	

	
	Optional<Reservation> findById(Integer id);
	
	void deleteById(int id);
	
	
	
	<S extends Reservation> S save(S entity);
}

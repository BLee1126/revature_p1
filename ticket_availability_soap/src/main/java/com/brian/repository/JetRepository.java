package com.brian.repository;

import org.springframework.stereotype.Repository;


import com.brian.models.Jet;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository("jetRepository")
public interface JetRepository extends JpaRepository<Jet, Integer>{
	List<Jet> findAll();
	
	Optional<Jet> findById(Integer id);
	
	void deleteById(int id);
	
	
	
	<S extends Jet> S save(S entity);
}

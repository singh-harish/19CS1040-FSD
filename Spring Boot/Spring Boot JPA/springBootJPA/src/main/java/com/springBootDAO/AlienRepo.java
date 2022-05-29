package com.springBootDAO;

import org.springframework.data.repository.CrudRepository;

import com.springBootBean.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
	
}

package com.susmi.herokudemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.susmi.herokudemo.model.Person;
@Repository
public interface PersonRepo extends JpaRepository<Person, Long>{
	

}

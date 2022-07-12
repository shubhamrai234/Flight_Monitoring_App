package com.project.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.model.Data;

@Repository
@Transactional
public interface FlightDao extends MongoRepository<Data, String>{
	

}

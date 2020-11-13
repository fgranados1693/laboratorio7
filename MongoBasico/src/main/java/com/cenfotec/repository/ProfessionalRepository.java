package com.cenfotec.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cenfotec.domain.Professional;

public interface ProfessionalRepository extends MongoRepository< Professional, String> {
	public List< Professional > findByName(String name);
}
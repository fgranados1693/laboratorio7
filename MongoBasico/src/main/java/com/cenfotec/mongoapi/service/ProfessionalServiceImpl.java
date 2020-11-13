package com.cenfotec.mongoapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenfotec.domain.Professional;
import com.cenfotec.repository.ProfessionalRepository;

@Service
public class ProfessionalServiceImpl implements ProfessionalService {
	@Autowired
	ProfessionalRepository professionalRepo;
	
	@Override
	public void saveProfessional(Professional newProfessional) {
		professionalRepo.save(newProfessional);
	}
}
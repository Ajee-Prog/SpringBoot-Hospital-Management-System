package com.yustech.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yustech.entity.Patient;
import com.yustech.repository.PatientRepository;

@RestController
@RequestMapping("/api/v1/Patient")
public class PatientController {
	
	private PatientRepository patientRepo;
	
	public PatientController(PatientRepository patientRepo) {
		super();
		this.patientRepo = patientRepo;
	}

	
	@PostMapping("/Create")
	public Patient createPatient(@RequestBody Patient patient) {
		return patientRepo.save(patient);
		
		//return "Patient saved Successfully ";
	}

}

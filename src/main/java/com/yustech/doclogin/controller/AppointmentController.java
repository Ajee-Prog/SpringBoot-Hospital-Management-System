package com.yustech.doclogin.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yustech.doclogin.entity.Appointment;
import com.yustech.doclogin.repository.AppointmentRepository;

@RestController
@RequestMapping("/api/v3/Appointment")
public class AppointmentController {
	
	private AppointmentRepository appointmentRepo;

	public AppointmentController(AppointmentRepository appointmentRepo) {
		super();
		this.appointmentRepo = appointmentRepo;
	}
	
	@PostMapping("/Create")
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		
		return appointmentRepo.save(appointment);
	}

}

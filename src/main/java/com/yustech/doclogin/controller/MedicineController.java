package com.yustech.doclogin.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yustech.doclogin.entity.Medicine;
import com.yustech.doclogin.repository.MedicineRepository;

@RestController
@RequestMapping("/api/v2/Medicine")
public class MedicineController {
	
	private MedicineRepository medicineRepo;

	public MedicineController(MedicineRepository medicineRepo) {
		super();
		this.medicineRepo = medicineRepo;
	}
	
	@PostMapping("/Create")
	public Medicine createMedicine(@RequestBody Medicine medicine) {
		return medicineRepo.save(medicine);
	}
	

}

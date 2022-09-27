package com.satishlabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.satishlabs.entity.Motorcycle;
import com.satishlabs.service.MotorcycleService;

@RestController
@RequestMapping("/motorcycle")
public class MotorcycleController {
	@Autowired
	private MotorcycleService motorcycleService;
	
	@PostMapping("/savemotorcycle")
	public Motorcycle saveMotorcycle(@RequestBody Motorcycle motorcycle) {
		System.out.println("Motorcycle are saved...");
		Motorcycle outMotorcycle = motorcycleService.saveMotorcycle(motorcycle);
		System.out.println("Saved Motorcycle: "+outMotorcycle);
		return outMotorcycle;
	}
	
	@GetMapping("/getMotorcycle/{id}")
	public Motorcycle getMotorcycleById(@PathVariable Integer id) {
		return motorcycleService.getMotorcycleById(id);
	}
	
	@GetMapping("/allmotorcycle")
	public List<Motorcycle> getAllMotorcycle(){
		List<Motorcycle> moList = motorcycleService.getMotorcycleList();
		return moList;
	}
}

package com.satishlabs.service;

import java.util.List;

import com.satishlabs.entity.Motorcycle;

public interface MotorcycleService {

	Motorcycle saveMotorcycle(Motorcycle motorcycle);
	public Motorcycle getMotorcycleById(Integer id);
	public List<Motorcycle> getMotorcycleList();

}

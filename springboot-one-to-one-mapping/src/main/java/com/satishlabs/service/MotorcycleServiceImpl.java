package com.satishlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.satishlabs.entity.Motorcycle;
import com.satishlabs.repo.MotorcycleRepository;

@Transactional
@Service
public class MotorcycleServiceImpl implements MotorcycleService{
	@Autowired
	private MotorcycleRepository motorcycleRepository;

	@Override
	public Motorcycle saveMotorcycle(Motorcycle motorcycle) {
		return motorcycleRepository.save(motorcycle);
	}

	@Override
	public Motorcycle getMotorcycleById(Integer id) {
		return motorcycleRepository.findById(id).get();
	}

	@Override
	public List<Motorcycle> getMotorcycleList() {
		return motorcycleRepository.findAll();
	}
}

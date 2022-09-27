package com.satishlabs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satishlabs.entity.Motorcycle;

public interface MotorcycleRepository extends JpaRepository<Motorcycle, Integer>{

}

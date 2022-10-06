package com.satishlabs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satishlabs.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer>{
	
}

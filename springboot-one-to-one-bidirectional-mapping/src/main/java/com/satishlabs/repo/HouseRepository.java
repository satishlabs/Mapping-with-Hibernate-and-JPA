package com.satishlabs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satishlabs.entity.House;

public interface HouseRepository extends JpaRepository<House, Integer>{

}

package com.satishlabs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ENGINE")
public class Engine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "engine_type")
	private String engineType = "";

	@Column(name = "capacity")
	private String capacity = "";

	@Column(name = "max_torque")
	private String maxTorque = "";
	
	public Engine() {}
	
	public Engine(String engineType, String capacity, String maxTorque) {
		this.engineType = engineType;
		this.capacity = capacity;
		this.maxTorque = maxTorque;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getMaxTorque() {
		return maxTorque;
	}

	public void setMaxTorque(String maxTorque) {
		this.maxTorque = maxTorque;
	}

	@Override
	public String toString() {
		return id + ", " + engineType + ", " + capacity + ", " + maxTorque;
	}
	
	
}

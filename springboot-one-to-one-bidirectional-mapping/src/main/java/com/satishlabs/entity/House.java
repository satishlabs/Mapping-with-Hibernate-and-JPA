package com.satishlabs.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HOUSE")
public class House {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "no_of_floor")
	private int noOfFloor = 0;

	@Column(name = "no_of_bed_room")
	private int noOfBedRoom = 0;

	@Column(name = "area")
	private String area = "";
	
	@OneToOne(mappedBy = "house",cascade = CascadeType.ALL)
	private Owner owner;
	
	public House() {}
	
	public House(int noOfFloor, int noOfBedRoom, String area, Owner owner) {
		super();
		this.noOfFloor = noOfFloor;
		this.noOfBedRoom = noOfBedRoom;
		this.area = area;
		this.owner = owner;
	}

	public int getNoOfFloor() {
		return noOfFloor;
	}

	public void setNoOfFloor(int noOfFloor) {
		this.noOfFloor = noOfFloor;
	}

	public int getNoOfBedRoom() {
		return noOfBedRoom;
	}

	public void setNoOfBedRoom(int noOfBedRoom) {
		this.noOfBedRoom = noOfBedRoom;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return id + ", " + noOfFloor + ", " + noOfBedRoom + ", " + area+ ", " + owner;
	}
	
	
}

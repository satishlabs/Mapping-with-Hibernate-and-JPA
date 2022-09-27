package com.satishlabs.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MOTOR_CYCLE")
public class Motorcycle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	 @Column(name = "model_name")
	  private String modelName = "";
	           
	  @Column(name = "manufacturer_name")
	  private String manufacturerName = "";
	           
	  @Column(name = "gear_box")
	  private String gearBox = "";
	           
	  @Column(name = "wheels")
	  private String wheels = "";
	           
	  @Column(name = "length")
	  private String length = "";
	           
	  @Column(name = "height")
	  private String height = "";
	  
	  @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "engine_id")
	  private Engine engine;

		public Motorcycle() {}
		
	public Motorcycle(String modelName, String manufacturerName, String gearBox, String wheels, String length,
			String height, Engine engine) {
		super();
		this.modelName = modelName;
		this.manufacturerName = manufacturerName;
		this.gearBox = gearBox;
		this.wheels = wheels;
		this.length = length;
		this.height = height;
		this.engine = engine;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getGearBox() {
		return gearBox;
	}

	public void setGearBox(String gearBox) {
		this.gearBox = gearBox;
	}

	public String getWheels() {
		return wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return id + ", " + modelName + ", " + manufacturerName
				+ ", " + gearBox + ", " + wheels + ", " + length + ", " + height
				+ ", " + engine;
	}
	  
	  

}

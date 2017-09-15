package com.capgemini.carcorpo.service.to;

import com.capgemini.carcorpo.constants.CarBrand;
import com.capgemini.carcorpo.constants.CarProperty;

public class CarTO {

	public CarTO() {

	}

	private long id;
	private CarBrand brand;
	private int capacity;
	private long mileage;
	private CarProperty typeOfProperty;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public CarBrand getBrand() {
		return brand;
	}

	public void setBrand(CarBrand brand) {
		this.brand = brand;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public long getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public CarProperty getTypeOfProperty() {
		return typeOfProperty;
	}

	public void setTypeOfProperty(CarProperty typeOfProperty) {
		this.typeOfProperty = typeOfProperty;
	}

	public CarTO(long id, CarBrand brand, int capacity, long mileage, CarProperty typeOfProperty) {
		super();
		this.id = id;
		this.brand = brand;
		this.capacity = capacity;
		this.mileage = mileage;
		this.typeOfProperty = typeOfProperty;
	}

}

package com.capgemini.carcorpo.service.to;

import com.capgemini.carcorpo.constants.CarBrand;

public class PrivateCarTO {

	public PrivateCarTO() {

	}

	private long id;
	private CarBrand brand;
	private int capacity;
	private long mileage;
	private long pesel;

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

	public void setMileage(long mileage) {
		this.mileage = mileage;
	}

	public long getPesel() {
		return pesel;
	}

	public void setPesel(long pesel) {
		this.pesel = pesel;
	}

	public PrivateCarTO(long id, CarBrand brand, int capacity, long mileage, long pesel) {
		super();
		this.id = id;
		this.brand = brand;
		this.capacity = capacity;
		this.mileage = mileage;
		this.pesel = pesel;
	}

}

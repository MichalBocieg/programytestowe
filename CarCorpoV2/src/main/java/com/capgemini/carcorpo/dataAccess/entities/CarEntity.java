package com.capgemini.carcorpo.dataAccess.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.capgemini.carcorpo.constants.CarBrand;
import com.capgemini.carcorpo.constants.CarProperty;

@Entity
@Table(name = "Car")
public class CarEntity implements Serializable {
	private static final long serialVersionUID = 793123456789L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", unique = true, nullable = false)
	private long id;

	@Column(name = "BRAND", nullable = false)
	private CarBrand brand;

	@Column(name = "CAPACITY", nullable = false)
	private int capacity;

	@Column(name = "MILEAGE", nullable = false)
	private long mileage;

	@Column(name = "TYPEOFPROPERTY", nullable = false)
	private CarProperty typeOfProperty;

	@OneToMany(targetEntity = AssignmentEntity.class, mappedBy = "car", cascade = CascadeType.ALL)
	private Set<AssignmentEntity> assignments = new HashSet<AssignmentEntity>();

	public CarEntity() {
	}

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

	public CarProperty getTypeOfProperty() {
		return typeOfProperty;
	}

	public void setTypeOfProperty(CarProperty typeOfProperty) {
		this.typeOfProperty = typeOfProperty;
	}

}
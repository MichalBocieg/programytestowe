package com.capgemini.carcorpo.dataAccess.entities;

import java.io.Serializable;

import javax.persistence.FetchType;

import com.capgemini.carcorpo.dataAccess.entities.PersonEntity;
import com.capgemini.carcorpo.constants.CarBrand;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRIVATECAR")
public class PrivateCarEntity implements Serializable {

	private static final long serialVersionUID = 7931234556789L;

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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PERSON", nullable = false)
	private PersonEntity person;

	public PrivateCarEntity() {
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

	public PersonEntity getPerson() {
		return person;
	}

	public void setPerson(PersonEntity person) {
		this.person = person;
	}

}
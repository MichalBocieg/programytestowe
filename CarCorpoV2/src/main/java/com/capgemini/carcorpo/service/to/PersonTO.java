package com.capgemini.carcorpo.service.to;

import java.sql.Date;

public class PersonTO {

	public PersonTO() {

	}

	private long pesel;
	private String firstName;
	private String secondName;
	private Date dateOfEmployment;

	public long getPesel() {
		return pesel;
	}

	public void setPesel(long pesel) {
		this.pesel = pesel;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public Date getDateOfEmployment() {
		return dateOfEmployment;
	}

	public void setDateOfEmployment(Date dateOfEmployment) {
		this.dateOfEmployment = dateOfEmployment;
	}

	public PersonTO(long pesel, String firstName, String secondName, Date dateOfEmployment) {
		super();
		this.pesel = pesel;
		this.firstName = firstName;
		this.secondName = secondName;
		this.dateOfEmployment = dateOfEmployment;
	}

}

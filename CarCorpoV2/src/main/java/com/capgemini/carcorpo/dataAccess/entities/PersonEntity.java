package com.capgemini.carcorpo.dataAccess.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class PersonEntity implements Serializable {

	private static final long serialVersionUID = 793123456789L;

	@Id
	@Column(name = "PESEL", nullable = false)
	private long pesel;

	@Column(name = "FIRSTNAME")
	private String firstName;

	@Column(name = "SECONDNAME")
	private String secondName;

	@Column(name = "DATEOFEMPLOYMENT")
	private Date dateOfEmployment;

	@OneToMany(targetEntity = AssignmentEntity.class, mappedBy = "person", cascade = CascadeType.ALL)
	private Set<AssignmentEntity> assignments = new HashSet<AssignmentEntity>();

	@OneToMany(targetEntity = PrivateCarEntity.class, mappedBy = "person", cascade = CascadeType.ALL)
	private Set<PrivateCarEntity> cars = new HashSet<PrivateCarEntity>();

	////// hibernate ////
	public PersonEntity() {

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

	public long getPesel() {
		return pesel;
	}

	public void setPesel(long pesel) {
		this.pesel = pesel;
	}

	public Date getDateOfEmployment() {
		return dateOfEmployment;
	}

	public void setDateOfEmployment(Date dateOfEmployment) {
		this.dateOfEmployment = dateOfEmployment;
	}

}
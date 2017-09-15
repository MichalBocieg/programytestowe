package com.capgemini.carcorpo.service;

import java.sql.Date;
import java.util.List;

import com.capgemini.carcorpo.dataAccess.entities.PersonEntity;
import com.capgemini.carcorpo.service.exception.UnknownObjectRequestException;

public interface PersonService {

	PersonEntity getPerson(long pesel) throws UnknownObjectRequestException;

	List<PersonEntity> getByFirstName(String firstName);

	List<PersonEntity> getBySecondName(String secondName);

	List<PersonEntity> getByPesel(long pesel);

	List<PersonEntity> getByDateOfEmployment(Date dateOfEmployment);

	void deletePerson(long pesel);

	PersonEntity updatePerson(PersonEntity personEntity);

	PersonEntity addPerson(PersonEntity personEntity);

	List<PersonEntity> getAll();
}

package com.capgemini.carcorpo.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.carcorpo.dao.PersonDao;
import com.capgemini.carcorpo.dataAccess.entities.PersonEntity;
import com.capgemini.carcorpo.service.PersonService;
import com.capgemini.carcorpo.service.exception.UnknownObjectRequestException;

@Service
@Transactional(readOnly = true)
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;

	public PersonEntity getPerson(long pesel) throws UnknownObjectRequestException {
		return personDao.findOne(pesel);
	}

	public List<PersonEntity> getByFirstName(String firstName) {
		return personDao.getByFirstName(firstName);
	}

	public List<PersonEntity> getBySecondName(String secondName) {
		return personDao.getBySecondName(secondName);
	}

	public List<PersonEntity> getByPesel(long pesel) {
		return personDao.getByPesel(pesel);
	}

	public List<PersonEntity> getByDateOfEmployment(Date dateOfEmployment) {
		return personDao.getByDateOfEmployment(dateOfEmployment);
	}

	public void deletePerson(long pesel) {
		personDao.delete(pesel);
	}

	public PersonEntity addPerson(PersonEntity personEntity) {
		return personDao.save(personEntity);
	}

	public PersonEntity updatePerson(PersonEntity personEntity) {
		return personDao.update(personEntity);
	}

	public List<PersonEntity> getAll() {
		return personDao.findAll();
	}

}

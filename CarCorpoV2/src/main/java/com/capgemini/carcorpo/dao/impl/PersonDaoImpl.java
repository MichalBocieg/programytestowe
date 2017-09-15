package com.capgemini.carcorpo.dao.impl;

import java.sql.Date;
import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.carcorpo.dao.PersonDao;
import com.capgemini.carcorpo.dataAccess.entities.PersonEntity;
import com.capgemini.carcorpo.service.exception.UnknownObjectRequestException;

@Repository
public class PersonDaoImpl extends AbstractDao<PersonEntity, Long> implements PersonDao {
	public PersonDaoImpl() {

	}

	public List<PersonEntity> getByPesel(long pesel) {
		TypedQuery<PersonEntity> query = entityManager.createQuery(
				"select person from PersonEntity person where person.pesel = :personPesel", PersonEntity.class);

		query.setParameter("personPesel", pesel);

		return query.getResultList().isEmpty() ? null : query.getResultList();
	}

	public List<PersonEntity> getByFirstName(String firstName) {
		TypedQuery<PersonEntity> query = entityManager.createQuery(
				"select person from PersonEntity person where person.firstname = :personFirstName", PersonEntity.class);

		query.setParameter("personFirstName", firstName);

		return query.getResultList().isEmpty() ? null : query.getResultList();
	}

	public List<PersonEntity> getBySecondName(String secondName) {
		TypedQuery<PersonEntity> query = entityManager.createQuery(
				"select person from PersonEntity person where person.secondName = :personSecondName",
				PersonEntity.class);

		query.setParameter("personSecondName", secondName);

		return query.getResultList().isEmpty() ? null : query.getResultList();
	}

	public List<PersonEntity> getByDateOfEmployment(Date dateOfEmployment) {
		TypedQuery<PersonEntity> query = entityManager.createQuery(
				"select person from PersonEntity person where person.dateOfEmployment = :personDateOfEmployment",
				PersonEntity.class);

		query.setParameter("personDateOfEmployment", dateOfEmployment);

		return query.getResultList().isEmpty() ? null : query.getResultList();
	}

}

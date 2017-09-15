package com.capgemini.carcorpo.dao;

import java.sql.Date;
import java.util.List;

import com.capgemini.carcorpo.dataAccess.entities.PersonEntity;

public interface PersonDao extends Dao<PersonEntity, Long> {

	List<PersonEntity> getByPesel(long pesel);

	List<PersonEntity> getByFirstName(String firstName);

	List<PersonEntity> getBySecondName(String secondName);

	List<PersonEntity> getByDateOfEmployment(Date dateOfEmployment);

}
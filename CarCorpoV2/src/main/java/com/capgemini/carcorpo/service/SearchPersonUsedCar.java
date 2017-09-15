package com.capgemini.carcorpo.service;

import java.util.List;

import com.capgemini.carcorpo.dataAccess.entities.PersonEntity;

public interface SearchPersonUsedCar {

	List<PersonEntity> searchPersonUsedCar(long carId);

}

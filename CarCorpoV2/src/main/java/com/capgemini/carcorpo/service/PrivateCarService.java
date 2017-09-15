package com.capgemini.carcorpo.service;

import java.util.List;

import com.capgemini.carcorpo.constants.CarBrand;
import com.capgemini.carcorpo.dataAccess.entities.PrivateCarEntity;
import com.capgemini.carcorpo.service.exception.UnknownObjectRequestException;

public interface PrivateCarService {

	PrivateCarEntity getPrivateCar(long id) throws UnknownObjectRequestException;

	List<PrivateCarEntity> getByBrand(CarBrand brand);

	List<PrivateCarEntity> getByCapacity(int capacity);

	List<PrivateCarEntity> getByMileage(long mileage);

	List<PrivateCarEntity> getByPersonsPesel(long pesel);

	void deletePrivateCar(long id);

	PrivateCarEntity addPrivateCar(PrivateCarEntity privateCarEntity);

	PrivateCarEntity updatePrivateCar(PrivateCarEntity privateCarEntity);

	List<PrivateCarEntity> getAll();
}

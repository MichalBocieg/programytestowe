package com.capgemini.carcorpo.service;

import java.util.List;

import com.capgemini.carcorpo.constants.CarBrand;
import com.capgemini.carcorpo.constants.CarProperty;
import com.capgemini.carcorpo.dataAccess.entities.CarEntity;
import com.capgemini.carcorpo.service.exception.UnknownObjectRequestException;

public interface CarService {

	CarEntity getCar(long id) throws UnknownObjectRequestException;

	List<CarEntity> getByBrand(CarBrand brand);

	List<CarEntity> getByCapacity(int capacity);

	List<CarEntity> getByMileage(int mileage);

	List<CarEntity> getByTypeOfProperty(CarProperty typeOfProperty);

	void deleteCar(long id);

	CarEntity addCar(CarEntity carEntity);

	CarEntity updateCar(CarEntity carEntity);

	List<CarEntity> getAll();
}

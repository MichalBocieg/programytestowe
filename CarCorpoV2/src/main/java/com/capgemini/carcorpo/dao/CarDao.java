package com.capgemini.carcorpo.dao;

import java.util.List;

import com.capgemini.carcorpo.constants.CarProperty;
import com.capgemini.carcorpo.constants.CarBrand;
import com.capgemini.carcorpo.dataAccess.entities.CarEntity;

public interface CarDao extends Dao<CarEntity, Long> {

	List<CarEntity> getByBrand(CarBrand brand);

	List<CarEntity> getByCapacity(int capacity);

	List<CarEntity> getByMileage(long mileage);

	List<CarEntity> getByTypeOfProperty(CarProperty typeOfProperty);

}
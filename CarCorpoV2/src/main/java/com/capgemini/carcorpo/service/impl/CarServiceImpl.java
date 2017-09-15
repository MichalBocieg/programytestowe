package com.capgemini.carcorpo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.carcorpo.constants.CarBrand;
import com.capgemini.carcorpo.constants.CarProperty;
import com.capgemini.carcorpo.dao.CarDao;
import com.capgemini.carcorpo.dataAccess.entities.CarEntity;
import com.capgemini.carcorpo.service.CarService;
import com.capgemini.carcorpo.service.exception.UnknownObjectRequestException;

@Service
@Transactional(readOnly = true)
public class CarServiceImpl implements CarService {

	@Autowired
	private CarDao carDao;

	public CarEntity getCar(long id) throws UnknownObjectRequestException {
		return carDao.getOne(id);
	}

	public List<CarEntity> getByBrand(CarBrand brand) {
		return carDao.getByBrand(brand);
	}

	public List<CarEntity> getByMileage(int mileage) {
		return carDao.getByMileage(mileage);
	}

	public List<CarEntity> getByCapacity(int capacity) {
		return carDao.getByCapacity(capacity);
	}

	public List<CarEntity> getByTypeOfProperty(CarProperty typeOfProperty) {
		return carDao.getByTypeOfProperty(typeOfProperty);
	}

	public void deleteCar(long id) {
		carDao.delete(id);
	}

	public CarEntity addCar(CarEntity carEntity) {
		return carDao.save(carEntity);
	}

	public CarEntity updateCar(CarEntity carEntity) {
		return carDao.update(carEntity);
	}

	public List<CarEntity> getAll() {
		return carDao.findAll();
	}

}

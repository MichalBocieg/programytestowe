package com.capgemini.carcorpo.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.carcorpo.constants.CarProperty;
import com.capgemini.carcorpo.constants.CarBrand;
import com.capgemini.carcorpo.dao.CarDao;
import com.capgemini.carcorpo.dataAccess.entities.CarEntity;
import com.capgemini.carcorpo.service.exception.UnknownObjectRequestException;

@Repository
public class CarDaoImpl extends AbstractDao<CarEntity, Long> implements CarDao {
	public CarDaoImpl() {
		// @throws UnknownObjectRequestException
	}

	public List<CarEntity> getByBrand(CarBrand brand) {
		TypedQuery<CarEntity> query = entityManager
				.createQuery("select car from CarEntity car where car.brand = :carBrand", CarEntity.class);

		query.setParameter("carBrand", brand);

		return query.getResultList().isEmpty() ? null : query.getResultList();
	}

	public List<CarEntity> getByCapacity(int capacity) {
		TypedQuery<CarEntity> query = entityManager
				.createQuery("select car from CarEntity car where car.capacity = :carCapacity", CarEntity.class);

		query.setParameter("carCapacity", capacity);

		return query.getResultList().isEmpty() ? null : query.getResultList();
	}

	public List<CarEntity> getByMileage(long mileage) {
		TypedQuery<CarEntity> query = entityManager
				.createQuery("select car from CarEntity car where car.mileage = :carMileage", CarEntity.class);

		query.setParameter("carBrand", mileage);

		return query.getResultList().isEmpty() ? null : query.getResultList();
	}

	public List<CarEntity> getByTypeOfProperty(CarProperty propertyType) {
		TypedQuery<CarEntity> query = entityManager
				.createQuery("select car from CarEntity car where car.property = :carProperty", CarEntity.class);

		query.setParameter("carProperty", propertyType);

		return query.getResultList().isEmpty() ? null : query.getResultList();
	}
}

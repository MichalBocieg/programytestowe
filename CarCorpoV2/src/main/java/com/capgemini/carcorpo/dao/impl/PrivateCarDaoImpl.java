package com.capgemini.carcorpo.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.carcorpo.constants.CarBrand;
import com.capgemini.carcorpo.dao.PrivateCarDao;
import com.capgemini.carcorpo.dataAccess.entities.PrivateCarEntity;
import com.capgemini.carcorpo.service.exception.UnknownObjectRequestException;

@Repository
public class PrivateCarDaoImpl extends AbstractDao<PrivateCarEntity, Long> implements PrivateCarDao {
	public PrivateCarDaoImpl() {
		// @throws UnknownObjectRequestException
	}

	public List<PrivateCarEntity> getByBrand(CarBrand brand) {
		TypedQuery<PrivateCarEntity> query = entityManager
				.createQuery("select car from CarEntity car where car.brand = :carBrand", PrivateCarEntity.class);

		query.setParameter("carBrand", brand);

		return query.getResultList().isEmpty() ? null : query.getResultList();
	}

	public List<PrivateCarEntity> getByCapacity(int capacity) {
		TypedQuery<PrivateCarEntity> query = entityManager
				.createQuery("select car from CarEntity car where car.capacity = :carCapacity", PrivateCarEntity.class);

		query.setParameter("carCapacity", capacity);

		return query.getResultList().isEmpty() ? null : query.getResultList();
	}

	public List<PrivateCarEntity> getByMileage(long mileage) {
		TypedQuery<PrivateCarEntity> query = entityManager
				.createQuery("select car from CarEntity car where car.mileage = :carMileage", PrivateCarEntity.class);

		query.setParameter("carBrand", mileage);

		return query.getResultList().isEmpty() ? null : query.getResultList();
	}

	public List<PrivateCarEntity> getByPersonsPesel(long pesel) {
		TypedQuery<PrivateCarEntity> query = entityManager.createQuery(
				"select car from CarEntity car where car.employePesel = :carEmployePesel", PrivateCarEntity.class);

		query.setParameter("carEmployePesel", pesel);

		return query.getResultList().isEmpty() ? null : query.getResultList();
	}
}

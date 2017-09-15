package com.capgemini.carcorpo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.carcorpo.constants.CarBrand;
import com.capgemini.carcorpo.dao.PrivateCarDao;
import com.capgemini.carcorpo.dataAccess.entities.PrivateCarEntity;
import com.capgemini.carcorpo.service.PrivateCarService;
import com.capgemini.carcorpo.service.exception.UnknownObjectRequestException;

@Service
@Transactional(readOnly = true)
public class PrivateCarServiceImpl implements PrivateCarService {

	@Autowired
	private PrivateCarDao privateCarDao;

	public PrivateCarEntity getPrivateCar(long id) throws UnknownObjectRequestException {
		return privateCarDao.findOne(id);
	}

	public List<PrivateCarEntity> getByBrand(CarBrand brand) {
		return privateCarDao.getByBrand(brand);
	}

	public List<PrivateCarEntity> getByCapacity(int capacity) {
		return privateCarDao.getByCapacity(capacity);
	}

	public List<PrivateCarEntity> getByMileage(long mileage) {
		return privateCarDao.getByMileage(mileage);
	}

	public List<PrivateCarEntity> getByPersonsPesel(long pesel) {
		return privateCarDao.getByPersonsPesel(pesel);
	}

	public void deletePrivateCar(long id) {
		privateCarDao.delete(id);
	}

	public PrivateCarEntity addPrivateCar(PrivateCarEntity privateCarEntity) {
		return privateCarDao.save(privateCarEntity);
	}

	public PrivateCarEntity updatePrivateCar(PrivateCarEntity privateCarEntity) {
		return privateCarDao.update(privateCarEntity);
	}

	public List<PrivateCarEntity> getAll() {
		return privateCarDao.findAll();
	}

}

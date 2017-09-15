
package com.capgemini.carcorpo.dao;

import java.util.List;

import com.capgemini.carcorpo.constants.CarBrand;
import com.capgemini.carcorpo.dataAccess.entities.PrivateCarEntity;

public interface PrivateCarDao extends Dao<PrivateCarEntity, Long> {

	List<PrivateCarEntity> getByBrand(CarBrand brand);

	List<PrivateCarEntity> getByCapacity(int capacity);

	List<PrivateCarEntity> getByMileage(long mileage);

	List<PrivateCarEntity> getByPersonsPesel(long pesel);

}
package com.capgemini.carcorpo.dao;

import java.sql.Date;
import java.util.List;

import com.capgemini.carcorpo.dataAccess.entities.AssignmentEntity;

public interface AssignmentDao extends Dao<AssignmentEntity, Long> {

	List<AssignmentEntity> getByStartOfAssignment(Date startOfAssignment);

	List<AssignmentEntity> getByPersonsPesel(long pesel);

	List<AssignmentEntity> getByCarId(long carId);

}
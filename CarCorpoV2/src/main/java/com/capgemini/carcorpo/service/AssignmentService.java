package com.capgemini.carcorpo.service;

import java.sql.Date;
import java.util.List;

import com.capgemini.carcorpo.dataAccess.entities.AssignmentEntity;
import com.capgemini.carcorpo.service.exception.UnknownObjectRequestException;

public interface AssignmentService {

	AssignmentEntity getAssignment(long id) throws UnknownObjectRequestException;

	List<AssignmentEntity> getByStartOfAssignment(Date startOfAssignment);

	List<AssignmentEntity> getByPersonsPesel(long pesel);

	List<AssignmentEntity> getByCarId(long carId);

	void deleteAssignment(long id);

	AssignmentEntity addAssignment(AssignmentEntity assignmentEntity);

	AssignmentEntity updateAssignment(AssignmentEntity assignmentEntity);

	List<AssignmentEntity> getAll();
}

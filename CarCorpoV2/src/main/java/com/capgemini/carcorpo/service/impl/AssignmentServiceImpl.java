package com.capgemini.carcorpo.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.carcorpo.dao.AssignmentDao;
import com.capgemini.carcorpo.dataAccess.entities.AssignmentEntity;
import com.capgemini.carcorpo.service.AssignmentService;
import com.capgemini.carcorpo.service.exception.UnknownObjectRequestException;

@Service
@Transactional(readOnly = true)
public class AssignmentServiceImpl implements AssignmentService {

	@Autowired
	private AssignmentDao assignmentDao;

	public AssignmentEntity getAssignment(long id) throws UnknownObjectRequestException {
		return assignmentDao.findOne(id);
	}

	public List<AssignmentEntity> getByStartOfAssignment(Date startOfAssignment) {
		return assignmentDao.getByStartOfAssignment(startOfAssignment);
	}

	public List<AssignmentEntity> getByPersonsPesel(long pesel) {
		return assignmentDao.getByPersonsPesel(pesel);
	}

	public List<AssignmentEntity> getByCarId(long carId) {
		return assignmentDao.getByCarId(carId);
	}

	public void deleteAssignment(long id) {
		assignmentDao.delete(id);
	}

	public AssignmentEntity addAssignment(AssignmentEntity assignmentEntity) {
		return assignmentDao.save(assignmentEntity);
	}

	public AssignmentEntity updateAssignment(AssignmentEntity assignmentEntity) {
		return assignmentDao.update(assignmentEntity);
	}

	public List<AssignmentEntity> getAll() {
		return assignmentDao.findAll();
	}

}

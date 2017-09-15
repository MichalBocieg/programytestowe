package com.capgemini.carcorpo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.carcorpo.dao.AssignmentDao;
import com.capgemini.carcorpo.dao.CarDao;
import com.capgemini.carcorpo.dataAccess.entities.AssignmentEntity;
import com.capgemini.carcorpo.dataAccess.entities.CarEntity;
import com.capgemini.carcorpo.dataAccess.entities.PersonEntity;
import com.capgemini.carcorpo.service.SearchPersonUsedCar;

@Service
@Transactional(readOnly = true)
public class SearchPersonUsedCarImpl implements SearchPersonUsedCar {

	@Autowired
	private AssignmentDao assignmentDao;
	@Autowired
	private CarDao carDao;

	@Override
	public List<PersonEntity> searchPersonUsedCar(long carId) {

		List<PersonEntity> PersonsUsedCar = new ArrayList<PersonEntity>();

		List<AssignmentEntity> assignments = assignmentDao.getByCarId(carId);

		for (AssignmentEntity assignment : assignments) {
			if (!PersonsUsedCar.contains(assignment.getPerson())) {
				PersonsUsedCar.add(assignment.getPerson());
			}
		}
		return PersonsUsedCar;
	}

}

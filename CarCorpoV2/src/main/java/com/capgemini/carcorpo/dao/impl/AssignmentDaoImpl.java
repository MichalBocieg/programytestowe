package com.capgemini.carcorpo.dao.impl;

import java.util.List;
import java.sql.Date;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.carcorpo.dao.AssignmentDao;
import com.capgemini.carcorpo.dataAccess.entities.AssignmentEntity;
import com.capgemini.carcorpo.service.exception.UnknownObjectRequestException;

@Repository
public class AssignmentDaoImpl extends AbstractDao<AssignmentEntity, Long> implements AssignmentDao {
	public AssignmentDaoImpl() {
		// konstruktor
	}

	@Override
	public List<AssignmentEntity> getByStartOfAssignment(Date startOfAssignment) {
		TypedQuery<AssignmentEntity> query = entityManager.createQuery(
				"select assignment from AssignmentEntity assignment where assignment.startOfAssignment = :assignmentStartOfAssignment",
				AssignmentEntity.class);

		query.setParameter("assignmentStartOfAssignment", startOfAssignment);

		return query.getResultList().isEmpty() ? null : query.getResultList();
	}

	@Override
	public List<AssignmentEntity> getByPersonsPesel(long pesel) {
		TypedQuery<AssignmentEntity> query = entityManager.createQuery(
				"select assignment from AssignmentEntity assignment where assignment.person.pesel = :assignmentPersonPesel",
				AssignmentEntity.class);

		query.setParameter("assignmentPersonPesel", pesel);

		return query.getResultList().isEmpty() ? null : query.getResultList();
	}

	@Override
	public List<AssignmentEntity> getByCarId(long carId) {
		TypedQuery<AssignmentEntity> query = entityManager.createQuery(
				"select assignment from AssignmentEntity assignment where assignment.car.id = :assignmentCarId",
				AssignmentEntity.class);

		query.setParameter("assignmentCarId", carId);

		return query.getResultList().isEmpty() ? null : query.getResultList();
	}

}

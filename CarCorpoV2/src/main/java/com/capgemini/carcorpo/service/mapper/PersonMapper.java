package com.capgemini.carcorpo.service.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.capgemini.carcorpo.dataAccess.entities.PersonEntity;
import com.capgemini.carcorpo.service.to.PersonTO;

public class PersonMapper {

	public static PersonTO map(PersonEntity personEntity) {
		if (personEntity != null) {
			PersonTO personTO = new PersonTO(personEntity.getPesel(), personEntity.getFirstName(),
					personEntity.getSecondName(), personEntity.getDateOfEmployment());

			return personTO;
		}
		return null;
	}

	public static PersonEntity map(PersonTO personTO) {
		if (personTO != null) {
			PersonEntity personEntity = new PersonEntity();
			personEntity.setPesel(personTO.getPesel());
			personEntity.setFirstName(personTO.getFirstName());
			personEntity.setSecondName(personTO.getSecondName());
			personEntity.setDateOfEmployment(personTO.getDateOfEmployment());
			return personEntity;
		}
		return null;

	}

	public static PersonEntity update(PersonEntity personEntity, PersonTO personTO) {
		if (personEntity != null && personTO != null) {

		}
		return personEntity;
	}

	public static List<PersonTO> map2TOs(List<PersonEntity> personEntities) {
		return personEntities.stream().map(PersonMapper::map).collect(Collectors.toList());
	}

	public static List<PersonEntity> map2Entities(List<PersonTO> personTOs) {
		return personTOs.stream().map(PersonMapper::map).collect(Collectors.toList());
	}
}

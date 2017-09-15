package com.capgemini.carcorpo.service.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.capgemini.carcorpo.dataAccess.entities.PrivateCarEntity;
import com.capgemini.carcorpo.service.to.PrivateCarTO;

public class PrivateCarMapper {

	public static PrivateCarTO map(PrivateCarEntity privateCarEntity) {
		if (privateCarEntity != null) {
			PrivateCarTO privateCarTO = new PrivateCarTO(privateCarEntity.getId(), privateCarEntity.getBrand(),
					privateCarEntity.getCapacity(), privateCarEntity.getMileage(),
					privateCarEntity.getPerson().getPesel());

			return privateCarTO;
		}
		return null;
	}

	public static PrivateCarEntity map(PrivateCarTO privateCarTO) {
		if (privateCarTO != null) {
			PrivateCarEntity privateCarEntity = new PrivateCarEntity();
			privateCarEntity.setId(privateCarTO.getId());
			privateCarEntity.setBrand(privateCarTO.getBrand());
			privateCarEntity.setCapacity(privateCarTO.getCapacity());
			privateCarEntity.setMileage(privateCarTO.getMileage());
			return privateCarEntity;
		}
		return null;

	}

	public static PrivateCarEntity update(PrivateCarEntity privateCarEntity, PrivateCarTO privateCarTO) {
		if (privateCarEntity != null && privateCarTO != null) {

		}
		return privateCarEntity;
	}

	public static List<PrivateCarTO> map2TOs(List<PrivateCarEntity> privateCarEntities) {
		return privateCarEntities.stream().map(PrivateCarMapper::map).collect(Collectors.toList());
	}

	public static List<PrivateCarEntity> map2Entities(List<PrivateCarTO> privateCarTOs) {
		return privateCarTOs.stream().map(PrivateCarMapper::map).collect(Collectors.toList());
	}
}

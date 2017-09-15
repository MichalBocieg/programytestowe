package com.capgemini.carcorpo.service.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.carcorpo.service.SearchPersonUsedCar;
import com.capgemini.carcorpo.service.mapper.CarMapper;
import com.capgemini.carcorpo.service.mapper.PersonMapper;
import com.capgemini.carcorpo.service.to.CarTO;
import com.capgemini.carcorpo.service.to.PersonTO;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/rest/search")
public class SearchPersonUsedCarRestService {

	private SearchPersonUsedCar searchPersonUsedCarService;

	@Autowired
	public SearchPersonUsedCarRestService(SearchPersonUsedCar searchPersonUsedCarService) {
		this.searchPersonUsedCarService = searchPersonUsedCarService;
	}

	@RequestMapping(value = "/peopleUsedCar/{carId}", method = RequestMethod.GET)
	@ResponseBody
	public List<PersonTO> searchPersonUsedCar(@PathVariable long carId) {

		return PersonMapper.map2TOs(searchPersonUsedCarService.searchPersonUsedCar(carId));
	}

}

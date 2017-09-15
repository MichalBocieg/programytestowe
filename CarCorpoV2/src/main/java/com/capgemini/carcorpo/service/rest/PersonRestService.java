package com.capgemini.carcorpo.service.rest;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.carcorpo.service.PersonService;
import com.capgemini.carcorpo.service.exception.UnknownObjectRequestException;
import com.capgemini.carcorpo.service.mapper.PersonMapper;
import com.capgemini.carcorpo.service.to.PersonTO;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/rest/person")
public class PersonRestService {

	private PersonService personService;

	@Autowired
	public PersonRestService(PersonService personService) {
		this.personService = personService;
	}

	@RequestMapping(value = "/find/{pesel}", method = RequestMethod.GET)
	@ResponseBody
	public PersonTO readPerson(@PathVariable long pesel) throws UnknownObjectRequestException {

		return PersonMapper.map(personService.getPerson(pesel));
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	@ResponseBody
	public List<PersonTO> getAllPersons() throws UnknownObjectRequestException {

		return PersonMapper.map2TOs(personService.getAll());
	}

	@RequestMapping(value = "/find/byFirstName/{firstName}", method = RequestMethod.GET)
	@ResponseBody
	public List<PersonTO> readPersonByFirstName(@PathVariable String firstName) throws UnknownObjectRequestException {

		return PersonMapper.map2TOs(personService.getByFirstName(firstName));
	}

	@RequestMapping(value = "/find/bySecondName/{secondName}", method = RequestMethod.GET)
	@ResponseBody
	public List<PersonTO> readPersonBySecondName(@PathVariable String secondName) throws UnknownObjectRequestException {

		return PersonMapper.map2TOs(personService.getBySecondName(secondName));
	}

	@RequestMapping(value = "/find/byDateOfEmployment/{dateOfEmployment}", method = RequestMethod.GET)
	@ResponseBody
	public List<PersonTO> readPersonByDateOfEmployment(@PathVariable Date dateOfEmployment)
			throws UnknownObjectRequestException {

		return PersonMapper.map2TOs(personService.getByDateOfEmployment(dateOfEmployment));
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public PersonTO createPerson(@RequestBody PersonTO personTo) {
		return PersonMapper.map(personService.addPerson(PersonMapper.map(personTo)));

	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	@ResponseBody
	public PersonTO updatePerson(@RequestBody PersonTO personTo) {
		return PersonMapper.map(personService.updatePerson(PersonMapper.map(personTo)));

	}

	@RequestMapping(value = "/delete/{pesel}", method = RequestMethod.POST)
	@ResponseBody
	public void deletePerson(@PathVariable Long pesel) {
		personService.deletePerson(pesel);
	}

}

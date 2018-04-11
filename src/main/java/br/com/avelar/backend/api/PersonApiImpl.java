package br.com.avelar.backend.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.avelar.backend.model.Person;
import br.com.avelar.backend.service.PersonService;

@Component
public class PersonApiImpl implements PersonApi {
	
	@Autowired
	private PersonService personService;
	
	@Override
	public void savePerson(Person person) {
		personService.save(person);
	}

	@Override
	public List<Person> findAll() {
		return personService.findAll();
	}
	
}

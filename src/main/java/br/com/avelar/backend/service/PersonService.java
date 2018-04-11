package br.com.avelar.backend.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.avelar.backend.model.Person;
import br.com.avelar.backend.repository.PersonRepository;

@Service
@Transactional
public class PersonService {
	
	@Autowired
	private PersonRepository dao;
	
	public void save(Person person) {
		dao.save(person);
	}
	
	public Person findOne(Long id) {
		return dao.findOne(id);
	}
	
	public List<Person> findAll() {
		return dao.findAll();
	}
	
	public void delete(Person person) {
		dao.delete(person);
	}
	
}

package br.com.avelar.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.avelar.backend.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}

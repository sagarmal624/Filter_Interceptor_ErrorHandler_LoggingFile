package com.sagarandcompany.ScaffoldingSpringBoot.service;

import com.sagarandcompany.ScaffoldingSpringBoot.model.Person;
import com.sagarandcompany.ScaffoldingSpringBoot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public Person save(Person person) {
        return personRepository.save(person);

    }

    public List<Person> getAll() {
        return personRepository.findAll();

    }
}

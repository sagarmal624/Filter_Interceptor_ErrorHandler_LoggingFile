package com.sagarandcompany.ScaffoldingSpringBoot.controller;

import com.sagarandcompany.ScaffoldingSpringBoot.model.Person;
import com.sagarandcompany.ScaffoldingSpringBoot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping("/save")
    public Person save(@RequestBody Person person) {
        return personService.save(person);
    }

    @GetMapping("/get")
    public List<Person> getAll() {
        return personService.getAll();
    }

}

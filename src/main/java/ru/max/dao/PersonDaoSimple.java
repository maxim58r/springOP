package ru.max.dao;

import org.springframework.stereotype.Service;
import ru.max.domain.Person;

@Service
public class PersonDaoSimple implements PersonDao {
    private int age;

    public Person findByName(String name) {
        return new Person(name, age);
    }

}

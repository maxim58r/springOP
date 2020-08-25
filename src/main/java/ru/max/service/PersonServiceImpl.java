package ru.max.service;

import org.springframework.stereotype.Service;
import ru.max.dao.PersonDao;
import ru.max.domain.Person;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonDao dao;

    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }

    public Person getByName(String name) {
        return dao.findByName(name);
    }
}

package ru.max.service;

import ru.max.domain.Person;

public interface PersonService {

    Person getByName(String name);
}
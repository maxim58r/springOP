package ru.max.dao;

import ru.max.domain.Person;

public interface PersonDao {
    Person findByName(String name);
}

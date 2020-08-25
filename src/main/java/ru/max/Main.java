package ru.max;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.max.domain.Person;
import ru.max.service.PersonService;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        PersonService ps = context.getBean(PersonService.class);
        Person ivan = ps.getByName("Ivan");

        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());

    }
}


package com.myapp.bootstrap;

import com.github.javafaker.Faker;
import com.myapp.model.Student;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    public static List<Student> createStudents() {
        Faker faker = new Faker();
        return Arrays.asList(
                new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(18, 40), faker.address().state()),
                new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(18, 40), faker.address().state()),
                new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(18, 40), faker.address().state()),
                new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(18, 40), faker.address().state()),
                new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(18, 40), faker.address().state()),
                new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(18, 40), faker.address().state()),
                new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(18, 40), faker.address().state()),
                new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(18, 40), faker.address().state()),
                new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(18, 40), faker.address().state()),
                new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(18, 40), faker.address().state())
        );
    }
}

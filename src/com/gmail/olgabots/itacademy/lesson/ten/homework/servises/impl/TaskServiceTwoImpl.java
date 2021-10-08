package com.gmail.olgabots.itacademy.lesson.ten.homework.servises.impl;

import com.gmail.olgabots.itacademy.lesson.ten.homework.model.Person;
import com.gmail.olgabots.itacademy.lesson.ten.homework.servises.RandomService;
import com.gmail.olgabots.itacademy.lesson.ten.homework.servises.TaskService;

import java.util.ArrayList;
import java.util.List;

public class TaskServiceTwoImpl implements TaskService {

    private static final int COUNT_OF_PEOPLE = 20;
    private static final int AGE_FROM = 15;
    private static final int AGE_TO = 30;
    private static final int AGE_OF_MAJORITY = 18;

    private RandomService randomService;

    public TaskServiceTwoImpl(RandomService randomService) {
        this.randomService = randomService;
    }

    @Override
    public void runService() {
        System.out.println("__________Task two__________");

        List<Person> persons = generatePersonList(COUNT_OF_PEOPLE, AGE_FROM, AGE_TO);

        System.out.println("People list:");
        printFormattedPersonListInfo(persons);

    }

    private void printFormattedPersonListInfo(List<Person> persons) {
        int personNumber = 1;
        for (Person person : persons) {
            String formattedPersonInfo = getFormattedPersonInfo(person);
            System.out.println(personNumber++ + ". " + formattedPersonInfo);
        }
    }

    private List<Person> generatePersonList(int countOfPeople, int ageFrom, int ageTo) {
        List<Person> persons = new ArrayList<>(countOfPeople);
        for (int i = 0; i < countOfPeople; i++) {
            persons.add(generatePerson(ageFrom, ageTo));
        }
        return persons;
    }

    private String getFormattedPersonInfo(Person person) {
        String majorityStatus = person.getAge() >= AGE_OF_MAJORITY ? "Adult: " : "Infant: ";
        return majorityStatus + person.getName() + " " + person.getSurname() + " " + person.getAge();
    }


    private Person generatePerson(int ageFrom, int ageTo) {
        Person person = new Person();
        person.setName(randomService.getFirstName());
        person.setSurname(randomService.getLastName());
        person.setAge(randomService.getNextInt(ageFrom, ageTo));
        return person;
    }
}

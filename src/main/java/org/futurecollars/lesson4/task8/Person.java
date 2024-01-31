package org.futurecollars.lesson4.task8;

import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private int age;
    private String ID;

    public Person(String name, String surname, int age, String ID) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.ID = ID;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(ID, person.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, ID);
    }
}

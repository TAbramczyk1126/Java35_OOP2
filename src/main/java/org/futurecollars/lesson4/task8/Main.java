package org.futurecollars.lesson4.task8;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Jan", "Nowak", 40, "423456789");
        Person person2 = new Person("Jan", "Nowak", 40, "423456789");

        System.out.println(person1.equals(person2));
    }
}

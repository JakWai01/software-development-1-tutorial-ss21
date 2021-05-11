package org.example;
// import other package
import org.example.inhabitants.Person;

public class DriverPerson {

    public static void main(String[] args) {
        Person person = new Person("test");

        System.out.println(person.name);
    }
}

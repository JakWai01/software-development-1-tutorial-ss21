package org.example;
import org.example.string.String;

public class DriverString {
    public static void main(java.lang.String[] args) {
        String john = new String("John");    // my.personal.String constructor accepting a java.lang.String argument
        System.out.println("Name: " + john); // john.toString() executes my.personal.String.toString()
        System.out.println(john.sayHello());
    }
}
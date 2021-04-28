package org.example;

public class Dog {
    String name;
    int age;
    String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Dog(String name) {
        this.name = name;
    }

    public String bark() {
       return "bark";
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Laika", 2, "Husky");
        Dog dog2 = new Dog("Oscar");
//        dog.name = "Laika";
//        dog.age = 2;
//        dog.breed = "Husky";

        System.out.println(dog.name);
        System.out.println(dog.bark());
        System.out.println(dog2.name);
        System.out.println(dog.bark());
    }
}

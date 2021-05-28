package org.example;

/**
 * This program provides sweet little dogs
 *
 * @author  Jakob Waibel
 * @version 1.0
 * @since   2021-05-28
 */
public class Dog {
    private String name;
    int age;
    String breed;

    /**
     * Constructor for Dog
     * @param name  name of the dog
     * @param age age of the dog
     * @param breed breed of the dog
     */
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    /**
     * Another Constructor for Dog
     * @param name  name of the dog
     */
    public Dog(String name) {
        this.name = name;
    }

    /**
     * Make dog bark.
     *
     * @return "bark"
     */
    public String bark() {
       return "bark";
    }

    /**
     * Get name
     *
     * @return name of the dog
     */
    public String getName() {
        System.out.println("Name wurde abgefragt");
        return this.name;
    }

    @Override
    public String toString() {
        return "(Dog: " + this.name + ", " + this.age + ", " + this.breed + ")";
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

        System.out.println(dog);
    }
}

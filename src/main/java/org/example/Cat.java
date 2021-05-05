package org.example;

public class Cat {
    private String name;
    private int age;
    private String breed;
    private int cuteness;

    public Cat(String name, int age, String breed, int cuteness) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.cuteness = cuteness;
    }

    public String talk() {
        return "Miau!";
    }

    public String talk(String text) {
        return text;
    }

    public String talk(int text) {
        return "" + text;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Lola", 2, "Siam", 2);
        System.out.println(cat.talk());
        System.out.println(cat.talk("Gruess Gott!"));
        System.out.println(cat.talk(12));
    }
}

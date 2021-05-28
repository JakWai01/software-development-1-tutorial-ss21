package org.example;

public class Enum {

    public static void main(String[] args) {
        Difficulty difficulty = Difficulty.MEDIUM;
        if (difficulty == Difficulty.EASY) {
            System.out.println("EASY");
        } else if (difficulty == Difficulty.MEDIUM) {
            System.out.println("MEDIUM");
        } else {
            System.out.println("HARD");
        }
    }
}

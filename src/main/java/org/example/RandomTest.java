package org.example;
import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {

        Random rand = new Random();

        int n = rand.nextInt(50);

        n = rand.nextInt(50);
        System.out.println(n);

        double random = Math.floor(Math.random() * 49 + 1);

        System.out.println(random);
    }
}




package org.example;

public class Appril {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //int count = 0;
        //int zahl = 0;

        /*
        while(count < 10) {
            if (count % 2 != 0) {
                System.out.println(zahl);
            }

            zahl++;
            count++;
        }
        */
        // System.out.println(count);
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        */
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println(); // newline
        }

    }
}

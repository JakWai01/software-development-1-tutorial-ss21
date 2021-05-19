package org.example;
import org.example.string.String;

import java.util.Arrays;

public class DriverString {
    public static void main(java.lang.String[] args) {
        String john = new String("John");    // my.personal.String constructor accepting a java.lang.String argument
        System.out.println("Name: " + john); // john.toString() executes my.personal.String.toString()
        System.out.println(john.sayHello());

        System.out.println(john);

        java.lang.String[] weapons = {"shotgun", "sword", "harpoon", "AK-47"};
        int difficulty = 4;

        if (difficulty == 1) {
            System.out.println(weapons[3]);
        } else if (difficulty == 2) {
            System.out.println(weapons[0]);
        } else if (difficulty == 3) {
            System.out.println(weapons[1]);
        } else if (difficulty == 4) {
            System.out.println(weapons[2]);
        } else {
            System.out.println("invalid difficulty");
        }

        int[] noten = {1,2,3,4,5,6};
        // [1,2,3,4,5,6]
        System.out.println(Arrays.toString(noten));

        // immutable
        int[] noten2 = new int[6];
        // [0,0,0,0,0,0]
        System.out.println(noten2[3]);

        java.lang.String[] namen = new java.lang.String[4];
        System.out.println(namen[0]);

        System.out.println(namen.length);
        System.out.println(Arrays.toString(namen));
        namen[0] = "Jakob";
        namen[1] = "Paula";
        System.out.println(Arrays.toString(namen));
        java.lang.String temp = namen[0];
        namen[0] = namen[1];
        namen[1] = temp;
        System.out.println(Arrays.toString(namen));

        int[] arr = {1,2,3};
        int[] arr2;
        arr2 = arr.clone();

        int[] arr3 = new int[4];
        System.arraycopy(arr, 0, arr3, 0, arr.length);
        arr3[3] = 4;
        System.out.println(Arrays.toString(arr3));

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
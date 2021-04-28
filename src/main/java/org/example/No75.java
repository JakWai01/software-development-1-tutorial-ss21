package org.example;

public class No75 {

    public static void main(String[] args) {
        int numberOfRowGroups = 7;

        // Print tip
        for (int i = 0; i < numberOfRowGroups + 1; i++) {
            System.out.print(" ");
        }
        System.out.println("\\ /");

        // Print 2nd layer of tip
        for (int i = 0; i < numberOfRowGroups - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("-->*<--");

        // Print First part of tree
        for (int i = 0; i < numberOfRowGroups + 1; i++) {
            System.out.print(" ");
        }
        System.out.println("/_\\");

        // Print main body
        int count_even = 1;
        int count_odd = 2;

        int spaces_even = numberOfRowGroups;
        int spaces_odd = numberOfRowGroups - 1;

        // Loop through each row
        for (int i = 0; i < numberOfRowGroups * 2; i++) {

            // even rows
            if (i % 2 == 0) {
                for (int j = 0; j < spaces_even; j++) {
                    System.out.print(" ");

                }
                spaces_even--;
                System.out.print("/_");
                for (int j = 0; j < count_even; j++) {
                    System.out.print("\\_");
                }
                System.out.println("\\");
                count_even++;
            } else {
            // odd rows
                for (int j = 0; j < spaces_odd; j++) {
                    System.out.print(" ");

                }
                spaces_odd--;
                System.out.print("/_");
                for (int j = 0; j < count_odd; j++) {
                    System.out.print("/_");
                }
                System.out.println("\\");
                count_odd++;
            }
        }

        // print bottom part
        for (int i = 0; i < numberOfRowGroups; i++) {
            System.out.print(" ");
        }
        System.out.println("[___]");
    }
}

package org.example;

public class No79 {
    public static void main(String[] args) {

        final int LIMIT = 10;                     // Parameter is subject to change.

        // 2 additional spaces for the first digit
        System.out.print(" * |  ");

        // 3 " " for formatting and 2 for next number
        for (int col = 1; col <= LIMIT; col++) {   // Header line of columns ranging
            System.out.format("%3d  ", col);        // from 1 to LIMIT.
        }
        System.out.println();

        System.out.print("---+");                   // Header / table body separator.
        for (int col = 1; col <= LIMIT; col++) {
            System.out.print("-----");
        }
        System.out.println();

        for (int row = 1; row <= LIMIT; row++) {    // Printing rows.
            System.out.format("%3d|  ", row);
            for (int col = 1; col <= LIMIT; col++) { // Printing columns.
                System.out.format("%3d  ", row * col);
            }
            System.out.println();
        }
    }
}

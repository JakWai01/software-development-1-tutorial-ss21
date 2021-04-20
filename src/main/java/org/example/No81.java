package org.example;

public class No81 {

    public static void main(String[] args) {

        // Configure parameters
        int xDirection = 5;
        int yDirection = 2;
        int entriesPerBlock = 12;

        // Count for formula
        int count = 0;

        // Print header
        for (int i = 0; i < xDirection; i++) {
            System.out.print("  n |  n*n     ");
        }
        System.out.println();

        // Print table

        // Print "whole" rows
        for (int i = 0; i < yDirection; i++) {
            // Print header
            for (int j = 0; j < xDirection; j++) {
                System.out.print("----+----------");
            }
            System.out.println();

            // for each row until entriesPerBlock
            for (int j = 0; j < entriesPerBlock; j++) {
                // print columns
                for (int k = 0; k < xDirection; k++) {
                    System.out.format("%3d |%5d     ", k*20+j+count,  (k*20+j+count)* (k*20+j+count));
                }
                System.out.println();
            }

            System.out.println();

            count += entriesPerBlock;
        }
    }
}

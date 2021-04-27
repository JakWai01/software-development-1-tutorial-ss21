package org.example;

public class No86 {

    public static void main(String[] args) {
        final int LIMIT = 20;
        int num = 20;
        boolean found;

        do {
            found = true;
            for (int i = 1; i < LIMIT; i++) {
                if (num % i != 0) {
                    num++;
                    found = false;
                    break;
                }
            }

        } while(found == false);

        System.out.println(num);
    }
}

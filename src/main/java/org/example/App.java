package org.example;

public class App {

    public static void main( String[] args ) {

        System.out.println("Hello World!");

        // datentyp name = wert
        int semester = 1;
        System.out.println(semester);

        // 0000 0000  0000 0000
        short kurz = 32767;
        System.out.println(kurz);

        // 0000 0000
        byte biss = 127;
        System.out.println(biss);

        // Kommazahlen
        float note = (float)1.0;
        System.out.println(note);

        // Wahr oder Falsch
        boolean horoskop = false;
        System.out.println(horoskop);

        // Binaer in Dezimal
        System.out.println(0b10001);

        // Hexademial in Dezimal
        System.out.println(0x10001);

        // Octal in Dezimal 1*8^1 + 3*8^0
        System.out.println(013);

        System.out.println("Result: " + 11 + 22);
        System.out.println("Result: 11" + 22);
        System.out.println("Result: 1122");
        System.out.println("Result: " + (11 + 22));
        System.out.println("Result: 33");
        System.out.println(11 + 22 + " is our result");
        System.out.println("33 is our result");

        // Concatenate Strings
        System.out.println("Jakob " + "ist " + "doof");
        System.out.format("%s %s", "Jakob", "Waibel");
    }
}


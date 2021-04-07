package org.example;

public class App {

    public static void main(String[] args) {

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
        float note = (float) 1.0;
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
        System.out.format("%s %s", "Jakob", "Waibel\n");

        // int int a = 2;

        // Camel Case
        String autoPlakettenAufschriftsSimulator = "test";

        // Normale Variable kann man aendern
        int age = 19;
        age = 4;

        // ...konstante Werte nicht
        final double pi = 3.141592653;

        // pi = 3; ERROR

        // Gross und Kleinschreibung matters! (Case sensitive)
        int alter = 19;
        int Alter = 20;

        System.out.println(alter + " " + Alter);

        // kleinen Datentyp "in grossen reinlegen" funktioniert (gross in klein quetschen hingegen nicht)
        byte klein = 2;
        int gross;
        gross = klein;

        // Wir koennen die Folgen der Typkonversion akzeptieren und trozdem "casten"
        // (dabei kann aber alles moegliche Passieren, siehe Ariane)
        int zahl1 = 1200;
        byte zahl2;
        // zahl2 = zahl1 ERROR
        zahl2 = (byte)zahl1; // Das Ergebnis ist trotzdem unbrauchbar, aber wir koennen es tun

        // Figure 129
        float float2Power31 = Integer.MAX_VALUE + 1f; // 2^31
        float floatDoubleMAX_VALUE = 2 * float2Power31 * float2Power31 - 1f; // 2^63 - 1

        // Ueber maximum, da float precision
        System.out.format("   Float value: %f\n", floatDoubleMAX_VALUE);
        System.out.println("Expected value: " + Long.MAX_VALUE);

        // Komische Ergebnisse bei Fliesskommazahlen (Siehe Mathe 1)
        for (int i = 0; i < 10; i++) {
            System.out.println(3.1432334 * i);
        }

        // Unendlich viele Zahlen mit endlich vielen Bits darstellen?
        double test = 1.8-0.1;
        double test2 = 1.6+0.1;
        System.out.println(test - test2);


        boolean isTrue = true;
        System.out.println(isTrue);

        boolean value = (2 < 5 && (2 != 3)) || (true);
        System.out.println(value);

        if (!value) {
            System.out.println("Ich bin im if!");
        }
        // age = 20
        String drink;

        if (age > 5 && age < 16) {
            System.out.println("Sorry du pimpf! Fuer dich gibts nichts!");
            drink = "Sprudel";
        } else if (age > 5 && age < 18) {
            System.out.println("Hier hast du Bier! Mehr geht nicht!");
            drink = "Bier";
        } else {
            System.out.println("Hier, dein White Russian!");
            drink = "Bacardi";
        }

        System.out.println(drink);

        int temperature = 8;

        if (temperature < 0) {
            System.out.println("EIS EIS BABY");
        } else if (temperature < 10) {
            System.out.println("JACKE");
        } else {
            System.out.println("Geh raus wie du willst");
        }

        if (temperature < 0) {
            System.out.println("Muetze");
        } else if (temperature < 10) {
            System.out.println("Jacke einpacken!");
        } else {
            System.out.println("Mach dir keinen Kopf, du koenntest Nackt gehen. Es ist warm!");
        }


        double dd = 3.4;
        int into = (int)dd;
        System.out.println(into);

        int i2 = 300;
        byte bito = (byte)300;
        System.out.println(bito);

        byte zah = (byte)128;
        System.out.println(zah);

        // switch
        String drink2 = "Wodka";
        switch(drink2) {
            case "Bier": System.out.println(drink2 + " sollte Bier sein");
                break;
            case "Wodka": System.out.println(drink2 + " sollte Wodka sein");
                break;
            case "Wasser": System.out.println(drink2 + " sollte Wasser sein");
                break;
            default: System.out.println("Kein valides Getraenk");
        }

        switch(drink2) {
            case "Bier" -> System.out.println("Bier");
            case "Wodka" -> System.out.println("Wodka");
            case "Wasser" -> System.out.println("Wasser");
            default -> System.out.println("sadasdlkasdjasld");
        }

        // while
        int count = 0;
        while (count < 0) {
            count++;
            System.out.println("Na");
        }

        // do while
        boolean nochmal_spielen;
        do {
            System.out.println("Batman");
            count++;;
        } while (count < 10);

        int count2 = 0;
        int countInnen = 0;

        while(count2 < 10) {
            count2++;
            while (countInnen < 10) {
                countInnen++;
                System.out.println("HIHIHIHI");
            }
            System.out.println("--------");
            countInnen = 0;
        }
    }
}


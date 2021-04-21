package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

        // Create object
        Computer gamingPC = new Computer();
        gamingPC.processor = "i7 6700K";
        gamingPC.gpu = "RTX 3090";
        gamingPC.height = 42;
        gamingPC.width = 22;

        System.out.println(gamingPC.processor);
        System.out.println(gamingPC.gpu);
        System.out.println(gamingPC.height);
        System.out.println(gamingPC.width);

        System.out.println(gamingPC);

        gamingPC = null;

        if (gamingPC == null) {
            System.out.println("Welcher Gaming PC?");
        } else {
            System.out.println("Genau der!");
        }
    }
}

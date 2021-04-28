package org.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a/b;
    }

    public static void main(String[] args) {
       Calculator calc = new Calculator();

       System.out.println(calc.add(1,3));
       System.out.println(calc.substract(1,3));
       System.out.println(calc.multiply(1,3));
       System.out.println(calc.divide(1,3));
    }
}

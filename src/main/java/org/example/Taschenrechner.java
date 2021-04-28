package org.example;

public class Taschenrechner {

    public int add(int a, int b) {
        return a + b;
    }
    
    public int sub(int j, int z){
        return j - z;

    }
    
    public int multiply (int m, int n) {
      return m * n ;

    }

    public double divide(int x, int y) {
        return (double)x/(double)y;
    }

    public void hey() {
       System.out.println("hey");
    }



    public static void main(String[] args) {
        Taschenrechner taschenrechner = new Taschenrechner();

        System.out.println(taschenrechner.add(1,2));
        System.out.println(taschenrechner.sub(16,2));
        System.out.println(taschenrechner.divide(10, 1));
        System.out.println(taschenrechner.multiply(5,6));
        taschenrechner.hey();

    }
}


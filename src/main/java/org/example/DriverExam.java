package org.example;

public class DriverExam {

    public static void main(String[] args) {

        Exam exam = new Exam("D118843", "Software-Entwicklung 1", "Ralf Rufus");
        Exam exam2 = new Exam("D123456", "", "Gernot Gockel");

        System.out.println(exam.getDozent());
        System.out.println(exam2.getDozent());
        System.out.println(Exam.getExamCount());

    }
}

package org.example.string;

public class String {
    java.lang.String text;

    public String(java.lang.String text) {
        this.text = text;
    }

    public java.lang.String sayHello() {
        return "Hello " + "'" + text + "'";
    }

    @Override
    public java.lang.String toString() {
        return text;
    }
}

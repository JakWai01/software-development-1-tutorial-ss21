package org.example;

public class Exam {
    private String edv;
    private String name;
    private String dozent;

    private static int examCount = 0;

    public Exam(String edv, String name, String dozent) {
        this.edv = edv;
        this.name = name;
        this.dozent = dozent;
        examCount++;
    }

    public static int getExamCount() {
        return examCount;
    }

    public String getEdv() {
        return edv;
    }

    public void setEdv(String edv) {
        this.edv = edv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDozent() {
        return dozent;
    }

    public void setDozent(String dozent) {
        this.dozent = dozent;
    }
}

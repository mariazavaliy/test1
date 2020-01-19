package com.company;

public class Humans {
    private String Name;
    private int Age;

    public Humans () {}

    public Humans (String name) {
        Name = name;

    }

    public Humans (String name, int age) {
        Name = name;
        Age = age;
    }

    public String GetName (){
        return Name;

    }

    public int GetAge () {
        return Age;
    }
}

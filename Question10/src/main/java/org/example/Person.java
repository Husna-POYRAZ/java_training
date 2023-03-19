package org.example;

public abstract class Person {
    protected String name;
    protected int age;
    protected long idnumber;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

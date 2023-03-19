package org.example;

public class Intern extends Person{
    protected String school;

    public Intern(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }
}

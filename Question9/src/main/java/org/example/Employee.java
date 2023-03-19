package org.example;

public class Employee extends Person{
    protected double salary;
    public double ssn;

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return (int) salary;
    }
}

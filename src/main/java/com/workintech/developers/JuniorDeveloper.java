package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper() {
    }

    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary()+500);
        System.out.println("Employee starts to working as Junior Developer");
    }
}

package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper() {
    }

    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary()+1500);
        System.out.println("Employee starts to working as Senior Developer");
    }
}

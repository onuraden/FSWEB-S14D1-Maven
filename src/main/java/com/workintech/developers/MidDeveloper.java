package com.workintech.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper() {
    }

    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary()+1000);
        System.out.println("Employee starts to working as Mid Developer");
    }
}

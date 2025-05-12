package com.workintech.developers;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager() {
    }

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[5];
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[5];
    }

    public void addEmployee(JuniorDeveloper developer) {
        addToArray(juniorDevelopers, developer);
    }

    public void addEmployee(MidDeveloper developer) {
        addToArray(midDevelopers, developer);
    }

    public void addEmployee(SeniorDeveloper developer) {
        addToArray(seniorDevelopers, developer);
    }

    private <T> void addToArray(T[] array, T employee) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = employee;
                System.out.println(employee.getClass().getSimpleName() + " added at index " + i);
                return;
            }
        }
        System.out.println("No empty slot available for " + employee.getClass().getSimpleName() + ".");
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }
}

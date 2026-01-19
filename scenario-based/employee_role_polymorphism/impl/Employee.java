package employee_role_polymorphism.impl;

public abstract class Employee {

    private final String name;
    private final double salary;

    protected Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    protected double getSalary() {
        return salary;
    }

    public abstract double getBonus();
}

package employee_role_polymorphism.impl;

public final class Manager extends Employee {

    private final double bonus;

    public Manager(String name, double salary) {
        super(name, salary);
        this.bonus = salary * 0.10;
    }

    @Override
    public double getBonus() {
        return bonus;
    }
}

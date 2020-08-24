package My_Work.java_2_basic_book_exercises.ex_17_inheritance;

public class Manager extends Employee {

    private final double bonus;

    Manager(String firstName, String lastName, double salary, double bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public double getSalary() {
        double managerSalary = super.getSalary();
        return managerSalary + bonus;
    }
}

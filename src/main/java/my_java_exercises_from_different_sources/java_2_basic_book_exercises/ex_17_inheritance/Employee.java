package My_Work.java_2_basic_book_exercises.ex_17_inheritance;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final double salary;

    Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public double getSalary() {
        return salary;
    }

}

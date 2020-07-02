package My_Work.java_2_basic_book_exercises.ex_17_inheritance;

public class Employee {

    private String firstName;
    private String lastName;
    private double salary;

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

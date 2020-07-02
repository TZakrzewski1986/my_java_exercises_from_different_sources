package My_Work.java_2_basic_book_exercises.ex_17_inheritance;

public class Runner {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Mark", "Hamill", 4000);
        staff[1] = new Employee("Darek", "Dareczny", 3000);
        staff[2] = new Manager("Tomasz", "Mistrzu", 10000, 5000);

        for (Employee e : staff) {
            System.out.println("Nazwisko i imię " + e.getName() + " oraz płaca " + e.getSalary());
        }
    }
}

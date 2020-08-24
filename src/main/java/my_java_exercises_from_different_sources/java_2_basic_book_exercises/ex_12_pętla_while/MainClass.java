package My_Work.java_2_basic_book_exercises.ex_12_pętla_while;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile pieniędzy potrzebujesz, aby przejść na emeryturę?");
        double goal = scanner.nextDouble();
        System.out.println("Ile pieniędzy będziesz rocznie wpłacał? ");
        double payment = scanner.nextDouble();
        System.out.println("Stopa procentowa w %: ");
        double interestRate = scanner.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("Możesz przejść na emryturę za " + years + " lat");
    }
}

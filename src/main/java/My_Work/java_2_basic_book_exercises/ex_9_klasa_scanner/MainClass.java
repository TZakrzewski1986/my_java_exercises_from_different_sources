package My_Work.java_2_basic_book_exercises.ex_9_klasa_scanner;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imię: ");
        String name = scanner.nextLine();
        System.out.println("Podaj swój wiek: ");
        int age = scanner.nextInt();
        System.out.println("Twoje imię to " + name);
        System.out.println("Natomias twój wiek to " + age + " W przyszłym roku będziesz miał lat " + (age + 1));
    }
}

package My_Work.java_2_basic_book_exercises.ex_14_instrukcja_switch;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę od 1 do 4: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Wybrałeś 1!");
                break;
            case 2:
                System.out.println("Wybrałeś 2!");
                break;
            case 3:
                System.out.println("Wybrałeś 3!");
                break;
            case 4:
                System.out.println("Wybrałeś 4!");
                break;
            default:
                System.out.println("Nie słuchasz komend!");

        }

    }
}

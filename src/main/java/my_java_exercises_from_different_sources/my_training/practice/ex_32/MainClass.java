package my_java_exercises_from_different_sources.my_training.practice.ex_32;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int x = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int y = scanner.nextInt();

        String result = String.valueOf(x + y);
        System.out.println(String.format(""));
    }
}

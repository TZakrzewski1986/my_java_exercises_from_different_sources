package my_java_exercises_from_different_sources.my_training.interview.ex_2_piramid_of_numbers;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak dużo linii ma mieć piramida?");
        int noOfRows = scanner.nextInt();
        int rowCount = 1;
        System.out.println("To Twoja piramida: ");
        for (int i = noOfRows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }
            System.out.println();
            rowCount++;
        }
    }
}

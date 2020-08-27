package my_java_exercises_from_different_sources.my_training.interview.ex_2_piramid_of_numbers;

// Reverse pyramid.

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows do you want in the Pyramid?");
        int noOfRows = scanner.nextInt();
        int rowCount = noOfRows;
        System.out.println("Here is Yours Pyramid: ");

        for (int i = 0; i < noOfRows; i++) {
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }
            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            rowCount--;
        }
    }
}

package my_java_exercises_from_different_sources.my_training.interview.ex_2_piramid_of_numbers;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows do you want in Your Pyramid?");
        int noOfRow = scanner.nextInt();
        int rowCount = 1;
        System.out.println("Here is Your Pyramid: ");
        for (int i = noOfRow; i >= 1; i--) {
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= noOfRow; j++) {
                System.out.print(j + " ");
            }
            for (int j = noOfRow - 1; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            rowCount++;

        }
    }
}

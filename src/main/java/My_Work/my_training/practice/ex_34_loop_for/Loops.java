package My_Work.my_training.practice.ex_34_loop_for;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj jak duży ma być kwadrat");
        int lines = scanner.nextInt();

        for (int x = lines; x > 0; x--) {
            for (int y = lines; y > 0; y--) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

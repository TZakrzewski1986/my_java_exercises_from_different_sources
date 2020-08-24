package My_Work.my_training.practice.ex_30;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item;

        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj co chcesz kupić: ");
            item = scanner.next();
            System.out.println("Dodano do koszyka");
            System.out.println(item);

        }
    }
}

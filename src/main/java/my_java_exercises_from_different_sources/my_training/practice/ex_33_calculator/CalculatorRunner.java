package my_java_exercises_from_different_sources.my_training.practice.ex_33_calculator;

import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        Sum usersSum = new Sum();
        Sub usersSub = new Sub();
        Mul usersMul = new Mul();
        Div usersDiv = new Div();

        Scanner scanner = new Scanner(System.in);
        String add = "Dodawanie";
        String sub = "Odejmowanie";
        String mul = "Mnożenie";
        String div = "Dzielenie";

        System.out.println(String.format("Podaj operację jaką chcesz wykonać: %s %s %s %s, Hmmm?", add, sub, mul, div));
        String userChoice = scanner.nextLine();

        switch (userChoice) {
            case "Dodawanie": {
                System.out.println("Podaj pierwszą liczbę");
                double x = scanner.nextDouble();
                System.out.println("Podaj drugą liczbę");
                double y = scanner.nextDouble();
                double sumResult = usersSum.returnSum(x, y);
                System.out.println(sumResult);
                break;
            }
            case "Odejmowanie": {
                System.out.println("Podaj pierwszą liczbę");
                double x = scanner.nextDouble();
                System.out.println("Podaj drugą liczbę");
                double y = scanner.nextDouble();
                double subResult = usersSub.returnSub(x, y);
                System.out.println(subResult);
                break;

            }
            case "Mnożenie": {
                System.out.println("Podaj pierwszą liczbę");
                double x = scanner.nextDouble();
                System.out.println("Podaj drugą liczbę");
                double y = scanner.nextDouble();
                double mulResult = usersMul.returnMul(x, y);
                System.out.println(mulResult);
                break;
            }
            case "Dzielenie": {
                System.out.println("Podaj pierwszą liczbę");
                double x = scanner.nextDouble();
                System.out.println("Podaj drugą liczbę");
                double y = scanner.nextDouble();
                double divResult = usersDiv.returnDiv(x, y);
                System.out.println(divResult);
                break;
            }
        }
    }
}

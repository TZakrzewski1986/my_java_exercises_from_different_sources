package My_Work.java_2_basic_book_exercises.ex_11_instrukcja_warunkowa_if_else;

public class MainClass {
    public static void main(String[] args) {
        double yourSales = 2000;
        double target = 1000;
        String performance;
        double bonus;

        if (yourSales >= 2 * target) {
            performance = "Znakomicie.";
            bonus = 1000;
            System.out.println(performance + " Twój bonus to: " + bonus);
        } else if (yourSales >= 1.5 * target) {
            performance = "Nieźle";
            bonus = 500;
            System.out.println(performance + " Twój bonus to: " + bonus);
        } else if (yourSales >= target) {
            performance = "średnio";
            bonus = 100;
            System.out.println(performance + " Twój bonus to: " + bonus);
        } else {
            System.out.println("Jesteś zwolniony");
        }
    }
}

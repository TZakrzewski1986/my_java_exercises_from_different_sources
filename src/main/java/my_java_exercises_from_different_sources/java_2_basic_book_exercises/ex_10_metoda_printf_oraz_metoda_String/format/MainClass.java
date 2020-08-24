package my_java_exercises_from_different_sources.java_2_basic_book_exercises.ex_10_metoda_printf_oraz_metoda_String.format;

public class MainClass {
    public static void main(String[] args) {
        double x = 1000.0 / 3.0;
        System.out.println(x);
        System.out.printf("%5.2f", x);
        System.out.printf("%n");            // separator wiersza
        System.out.println("-------");

        String name = "Stefan";
        int age = 32;
        System.out.printf("Witaj, %s. W tym roku masz %d lata.", name, age);
        System.out.printf("%n");
        System.out.println("----------");
        String message = String.format("Witaj, %s. Masz %d lata.", name, age);
        System.out.println(message);
    }


}

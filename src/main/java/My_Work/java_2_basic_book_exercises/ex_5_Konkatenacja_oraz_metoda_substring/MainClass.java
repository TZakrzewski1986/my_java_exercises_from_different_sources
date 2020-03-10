package My_Work.java_2_basic_book_exercises.ex_5_Konkatenacja_oraz_metoda_substring;

public class MainClass {
    public static void main(String[] args) {
        String greeting = "Cześć";
        System.out.println(greeting);
        greeting = greeting.substring(0, 3) + "kaj";
        System.out.println(greeting);
    }
}

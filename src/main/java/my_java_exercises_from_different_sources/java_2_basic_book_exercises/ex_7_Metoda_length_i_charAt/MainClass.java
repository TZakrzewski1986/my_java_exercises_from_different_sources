package My_Work.java_2_basic_book_exercises.ex_7_Metoda_length_i_charAt;

public class MainClass {
    public static void main(String[] args) {
        String greeting = "Cześć!";
        int n = greeting.length();
        System.out.println(n);
        char first = greeting.charAt(0);
        char last = greeting.charAt(4);
        System.out.println(first);
        System.out.println(last);
    }
}

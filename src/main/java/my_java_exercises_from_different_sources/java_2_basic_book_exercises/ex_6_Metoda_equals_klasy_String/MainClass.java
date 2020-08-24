package My_Work.java_2_basic_book_exercises.ex_6_Metoda_equals_klasy_String;

public class MainClass {
    public static void main(String[] args) {
        String a = "Cześć!";
        String b = "Cześć!";
        String c = "Fuck off!";
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        String d = "cześć!";
        System.out.println(a.equals(d));
        System.out.println(a.equalsIgnoreCase(d));

    }
}

package my_java_exercises_from_different_sources.my_training.interview.ex_1_reverse_a_String;

// Wykorzystanie metody iteracyjnej
// Przekonwertowanie Stringa na tablicę char

public class Example2 {
    public static void main(String[] args) {
        String str = "My JAVA";
        char[] strArray = str.toCharArray();
        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.println(strArray[i]);
        }
    }

}

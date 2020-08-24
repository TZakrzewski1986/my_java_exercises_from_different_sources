package my_java_exercises_from_different_sources.java_4_Sierra_K.ex_8;

public class ArraysTest {
    public static void main(String[] args) {
        String[] islands = new String[4];
        int[] index = new int[4];
        islands[0] = "Bermudy";
        islands[1] = "Fiji";
        islands[2] = "Azory";
        islands[3] = "Kozumel";

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        int ref;

        while (y < 4) {
            ref = index[y];
            System.out.print("wyspa to: ");
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
}

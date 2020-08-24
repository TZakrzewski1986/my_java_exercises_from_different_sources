package My_Work.java_2_basic_book_exercises.ex_16_Arrays_CopyOf;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int[] intBoard = {1, 2, 3, 4};
        int[] copiedIntBoard = Arrays.copyOf(intBoard, 8);
        int[] copiedIntBoard2 = Arrays.copyOf(intBoard, 3*intBoard.length);
        System.out.println(Arrays.toString(intBoard));
        System.out.println(Arrays.toString(copiedIntBoard));
        System.out.println(Arrays.toString(copiedIntBoard2));
    }
}

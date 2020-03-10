package My_Work.my_training.interview.ex_3_removing_white_spaces_in_a_String;

// using built-in-methods

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string to be cleaned from white spaces...!");
        String inputString = sc.nextLine();
        String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
        System.out.println("Input String : " + inputString);
        System.out.println("Input String Without Spaces : " + stringWithoutSpaces);
        sc.close();
    }
}
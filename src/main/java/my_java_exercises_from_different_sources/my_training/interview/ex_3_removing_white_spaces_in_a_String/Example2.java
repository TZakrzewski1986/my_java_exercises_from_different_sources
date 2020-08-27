package my_java_exercises_from_different_sources.my_training.interview.ex_3_removing_white_spaces_in_a_String;

// without built-in-methods

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string to be cleaned from white spaces...!");
        String inputString = sc.nextLine();
        char[] charArray = inputString.toCharArray();
        String stringWithoutSpaces = "";
        for (int i = 0; i < charArray.length; i++) {
            if ((charArray[i] != ' ') && (charArray[i] != '\t')) {
                stringWithoutSpaces = stringWithoutSpaces + charArray[i];
            }
        }

        System.out.println("Input String : " + inputString);

        System.out.println("Input String Without Spaces : " + stringWithoutSpaces);

        sc.close();
    }
}

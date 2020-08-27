package my_java_exercises_from_different_sources.my_training.interview.to_find_duplicate_characters_in_a_String;

import java.util.HashMap;
import java.util.Set;

public class Example1 {
    static void duplicateCharCount(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        Set<Character> charInString = charCountMap.keySet();
        System.out.println("Duplicate Characters In " + inputString);

        for (Character ch : charInString) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + " : " + charCountMap.get(ch));
            }
        }
    }

    public static void main(String[] args) {
        duplicateCharCount("JavaJ2EE");
        duplicateCharCount("Fresh Fish");
        duplicateCharCount("Better Butter");
    }
}

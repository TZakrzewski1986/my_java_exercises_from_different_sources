package my_java_exercises_from_different_sources.my_training.interview.ex_1_reverse_a_String;

// Użycie metody rekurencyjnej

public class Example3 {
    public static void main(String[] args) {
        String str = "My JAVA";
        System.out.println(recursiveMethod(str)); //Output : avaJyM
    }

    static String recursiveMethod(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }

        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}


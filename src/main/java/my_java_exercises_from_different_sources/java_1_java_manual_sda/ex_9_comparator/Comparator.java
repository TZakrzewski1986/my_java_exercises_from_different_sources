package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_9_comparator;

public class Comparator {
    public boolean compare(String text, String textToCompare){
        return text == textToCompare;
    }

    public boolean areDifferent(String text, String textToCompare) {
        return text != textToCompare;
    }

    public boolean isLower(int number, int numberToCompare) {
        return number < numberToCompare;
    }

    public boolean isGreater(int number, int numberToCompare) {
        return number > numberToCompare;
    }
}

package My_Work.java_1_Chruściel_Manual.ex_9_comparator;

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

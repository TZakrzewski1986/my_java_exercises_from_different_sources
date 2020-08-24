package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_17_elementy_statyczne;

public class MonthConstants {
    static String january = "January";
    static String february = "February";
    static String march = "March";
    static String april = "April";

    public static String getMonthByName(int number) {
        switch (number) {
            case 1:
                return january;
            case 2:
                return february;
            case 3:
                return march;
            default:
                return april;
        }
    }
}

package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_16_instrukcje_warunkowe;

public class Condition {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public int divisible(int number) {
        if (number % 2 == 0) {
            return 2;
        } else if (number % 5 == 0) {
            return 5;
        } else if (number % 7 == 0) {
            return 7;
        } else {
            return 0;
        }
    }

    public String getMonthNameBy(int number) {
        switch (number) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            default:
                return "April";
        }
    }

    public void getMonthsBy(int number) {
        switch (number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("April");
        }

    }
}

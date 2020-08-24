package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_21_enum;

public class Runner {
    public static void main(String[] args) {
        DayPrinter dayPrinter = new DayPrinter();
        dayPrinter.printDay(WeekDay.MONDAY);
        System.out.println(Month.getMonthBy("february", 2));


    }
}

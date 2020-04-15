package My_Work.java_1_Chruściel_Manual.ex_21_enum;

public class Runner {
    public static void main(String[] args) {
        DayPrinter dayPrinter = new DayPrinter();
        dayPrinter.printDay(WeekDay.MONDAY);
        System.out.println(Month.getMonthBy("february", 2));


    }
}

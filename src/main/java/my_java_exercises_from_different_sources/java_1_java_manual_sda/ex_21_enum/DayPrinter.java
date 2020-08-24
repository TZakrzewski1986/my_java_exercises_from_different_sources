package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_21_enum;

public class DayPrinter {

    public void printDay(WeekDay weekDay) {
        switch (weekDay) {
            case MONDAY:
                System.out.println("Loops");
            case TUESDAY:
                System.out.println("Arrays");
            case WEDNESDAY:
                System.out.println("Enums");
            case THURSDAY:
                System.out.println("Classes");
            case FRIDAY:
                System.out.println("Beer");
            case SATURDAY:
                System.out.println("REST");
            case SUNDAY:
                System.out.println("Java");
        }
    }
}

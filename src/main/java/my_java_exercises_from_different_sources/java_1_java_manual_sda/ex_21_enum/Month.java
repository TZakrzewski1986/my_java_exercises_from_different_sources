package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_21_enum;

public enum  Month {

    JANUARY("january", 1),
    FEBRUARY("february", 2),
    MARCH("march", 3),
    APRIL("april", 4),
    MAY("may", 5);

    private final String monthName;
    private final int monthNumber;

    Month(String monthName, int monthNumber) {
        this.monthName = monthName;
        this.monthNumber = monthNumber;
    }

    static String getMonthBy(String monthName, int monthNumber) {
        for (Month month: Month.values()) {
            if (month.monthNumber == monthNumber) {
                return month.monthName;
            }
        }
        return "Zły numer";
    }
}

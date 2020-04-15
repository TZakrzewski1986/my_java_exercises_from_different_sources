package My_Work.java_1_Chruściel_Manual.ex_21_enum;

public enum  Month {

    JANUARY("january", 1),
    FEBRUARY("february", 2),
    MARCH("march", 3),
    APRIL("april", 4),
    MAY("may", 5);

    private String monthName;
    private int monthNumber;

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

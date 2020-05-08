package My_Work.java_1_Chruściel_Manual.ex_23_localTime;

import java.time.LocalDate;
import java.time.Period;

public class Runner {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());

        System.out.println(LocalDate.of(1986, 03, 23));

        System.out.println(LocalDate.parse("1986-03-23"));

        System.out.println(LocalDate.now().plusDays(1));

        System.out.println(LocalDate.now().minusMonths(1));

        System.out.println(LocalDate.now().getDayOfMonth());
        System.out.println(LocalDate.now().getMonth());
        System.out.println(LocalDate.now().getYear());

        System.out.println(LocalDate.now().plusDays(1).isAfter(LocalDate.now()));
        System.out.println(LocalDate.now().plusDays(1).isBefore(LocalDate.now()));

        System.out.println(Period.between(LocalDate.now().minusDays(1), LocalDate.now().plusDays(1)).getDays());



    }
}

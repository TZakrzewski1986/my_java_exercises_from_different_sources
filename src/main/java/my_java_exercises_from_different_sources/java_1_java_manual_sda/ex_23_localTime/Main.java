package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_23_localTime;

import java.time.Duration;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.of(12, 30, 00));
        System.out.println(LocalTime.parse("12:30:00"));

        System.out.println(LocalTime.now().plusHours(1));

        System.out.println(LocalTime.now().plusMinutes(10));

        System.out.println(LocalTime.now().getHour());
        System.out.println(LocalTime.now().getMinute());
        System.out.println(LocalTime.now().getSecond());

        System.out.println(Duration.between(LocalTime.now().plusHours(1), LocalTime.now()).getSeconds());

    }
}

package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_27_functional_interface;

import java.util.function.Predicate;

public class IsEvenPredicate implements Predicate<Integer> {

    public boolean test(Integer integer) {
        return integer % 2==0;
    }
}

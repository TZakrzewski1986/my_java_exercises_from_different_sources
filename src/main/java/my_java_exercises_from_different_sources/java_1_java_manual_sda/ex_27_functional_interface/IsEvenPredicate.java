package My_Work.java_1_Chruściel_Manual.ex_27_functional_interface;

import java.util.function.Predicate;

public class IsEvenPredicate implements Predicate<Integer> {

    public boolean test(Integer integer) {
        return integer % 2==0;
    }
}

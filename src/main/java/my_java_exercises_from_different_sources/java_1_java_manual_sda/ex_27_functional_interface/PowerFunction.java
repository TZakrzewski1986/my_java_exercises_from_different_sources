package My_Work.java_1_Chruściel_Manual.ex_27_functional_interface;

import java.util.function.Function;

public class PowerFunction implements Function<Integer, Double> {

    @Override
    public Double apply(Integer integer) {
        return Math.pow(integer, integer);
    }
}

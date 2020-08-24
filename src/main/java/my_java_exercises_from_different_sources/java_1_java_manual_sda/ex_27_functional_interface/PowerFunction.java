package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_27_functional_interface;

import java.util.function.Function;

public class PowerFunction implements Function<Integer, Double> {

    @Override
    public Double apply(Integer integer) {
        return Math.pow(integer, integer);
    }
}

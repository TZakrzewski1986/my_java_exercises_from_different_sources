package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_27_functional_interface;

import java.util.function.Consumer;

public class NumberConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}

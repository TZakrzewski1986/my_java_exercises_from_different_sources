package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_27_functional_interface;

import java.util.Random;
import java.util.function.Supplier;

public class RandomSupplier implements Supplier<Integer> {

    @Override
    public Integer get() {
        return new Random().nextInt();
    }
}

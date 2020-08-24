package My_Work.java_1_Chruściel_Manual.ex_27_functional_interface;

import java.util.Random;
import java.util.function.Supplier;

public class RandomSupplier implements Supplier<Integer> {

    @Override
    public Integer get() {
        return new Random().nextInt();
    }
}

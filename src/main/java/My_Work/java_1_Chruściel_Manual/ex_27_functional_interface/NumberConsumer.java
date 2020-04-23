package My_Work.java_1_Chruściel_Manual.ex_27_functional_interface;

import java.util.function.Consumer;

public class NumberConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}

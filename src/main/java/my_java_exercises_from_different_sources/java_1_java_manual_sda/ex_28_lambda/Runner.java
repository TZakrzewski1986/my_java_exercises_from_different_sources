package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_28_lambda;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Runner {

    public static void main(String[] args) {
        Consumer<String> consumer = (x) -> System.out.println(x);
        Consumer<String> consumerMethodReference = System.out::println;

        consumer.accept("consumer");
        consumerMethodReference.accept("consumerMethodReference");

        Supplier<String> supplier = () -> "SDA";
        System.out.println(supplier.get());

        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        System.out.println(isEven.test(2));

        BiConsumer<String, String> biConsumer = (x, y) -> System.out.println(x + " " + y);
        biConsumer.accept("SDA", "Roxx");

        Optional.ofNullable(null).ifPresent(System.out::println);
        Optional.ofNullable(null).orElseGet(() -> "SDA");

        StringSupplier stringSupplier = () -> "SDA";
        System.out.println(stringSupplier.string());
    }
}

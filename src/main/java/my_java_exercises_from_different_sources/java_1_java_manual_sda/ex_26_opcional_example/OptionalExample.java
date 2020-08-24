package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_26_opcional_example;

public class OptionalExample {

    private final NullableExample nullableExample;

    OptionalExample(NullableExample nullableExample) {
        this.nullableExample = nullableExample;
    }

    String getOrDefault() {
        return nullableExample.getNull().orElse("Empty");
    }

    boolean get() {
        return nullableExample.getString().isPresent();
    }
}

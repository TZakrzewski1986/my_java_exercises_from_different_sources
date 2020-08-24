package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_26_opcional_example;

import java.util.Optional;

public class NullableExample {
    private final String string;

    NullableExample(String string) {
        this.string = string;
    }

    Optional<String> getNull() {
        return Optional.ofNullable(null);
    }

    Optional<String> getString() {
        return Optional.of(string);
    }
}

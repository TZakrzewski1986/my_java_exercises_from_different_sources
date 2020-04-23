package My_Work.java_1_Chruściel_Manual.ex_26_opcional_example;

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

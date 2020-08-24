package My_Work.java_1_Chruściel_Manual.ex_26_opcional_example;

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

package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_26_opcional_example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalExampleTest {

    @Test
    void shouldReturnDefaultString() {
        // Given
        NullableExample nullableExample = new NullableExample(null);
        OptionalExample optionalExample = new OptionalExample(nullableExample);
        // When
        String defaultValue = optionalExample.getOrDefault();
        // Then
        assertThat(defaultValue).isEqualTo("Empty");
    }

    @Test
    void shouldReturnTrueWhenValueIsGiven() {
        // Given
        NullableExample nullableExample = new NullableExample("String");
        OptionalExample optionalExample = new OptionalExample(nullableExample);
        // When
        boolean value = optionalExample.get();
        // Then
        assertThat(value).isTrue();
    }
}

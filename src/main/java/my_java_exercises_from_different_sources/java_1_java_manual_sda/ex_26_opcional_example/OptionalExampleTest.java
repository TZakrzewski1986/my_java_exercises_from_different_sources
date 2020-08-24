package My_Work.java_1_Chruściel_Manual.ex_26_opcional_example;

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

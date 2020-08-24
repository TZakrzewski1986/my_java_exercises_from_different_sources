package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_27_functional_interface;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsEvenPredicateTest {

    @Test
    void shouldReturnTrueWhenNumberIsEven() {
        // Given
        IsEvenPredicate isEvenPredicate = new IsEvenPredicate();
        // When
        boolean isEven = isEvenPredicate.test(2);
        // Then
        assertThat(isEven).isTrue();
    }

    @Test
    void shouldReturnFalseWhenNumberIsNotEven() {
        // Given
        IsEvenPredicate isEvenPredicate = new IsEvenPredicate();
        // When
        boolean isEven = isEvenPredicate.test(3);
        // Then
        assertThat(isEven).isFalse();
    }
}

package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_27_functional_interface;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsOddTest {

    @Test
    void shouldReturnFalseWhenValueIsNotOdd() {
        // Given
        IsOdd isOddChecker = new IsOdd();
        // When
        boolean isOdd = isOddChecker.isOdd(2);
        // Then
        assertThat(isOdd).isFalse();
    }

    @Test
    void shouldReturnTrueWhenNumberIsOdd() {
        // Given
        IsOdd isOddChecker = new IsOdd();
        // When
        boolean isOdd = isOddChecker.isOdd(3);
        // Then
        assertThat(isOdd).isTrue();
    }
}

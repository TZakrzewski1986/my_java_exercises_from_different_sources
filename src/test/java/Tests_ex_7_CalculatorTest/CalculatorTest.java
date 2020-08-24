package Tests_ex_7_CalculatorTest;

import my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_8_calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers() {
        // Given
        Calculator calculator = new Calculator();
        // When
        int resultToCheck = calculator.add(2, 2);
        // Then
        assertThat(resultToCheck).isEqualTo(4);
    }

    @Test
    public void shouldSubTwoNumbers() {
        // Given
        Calculator calculator = new Calculator();
        // When
        int resultToCheck = calculator.sub(2, 2);
        // Then
        assertThat(resultToCheck).isEqualTo(0);
    }

    @Test
    public void shouldMulTwoNumbers() {
        // Given
        Calculator calculator = new Calculator();
        // When
        int resultToCheck = calculator.mul(2, 2);
        // Then
        assertThat(resultToCheck).isEqualTo(4);
    }

    @Test
    public void shouldDivTwoNumbers() {
        // Given
        Calculator calculator = new Calculator();
        // When
        int resultToCheck = calculator.div(4, 2);
        // Then
        assertThat(resultToCheck).isEqualTo(2);
    }

    @Test
    public void shouldModTwoInts() {
        // Given
        Calculator calculator = new Calculator();
        // When
        int resultToCheck = calculator.mod(17, 4);
        // Then
        assertThat(resultToCheck).isEqualTo(1);
    }

    @Test
    public void shouldModOnTwoDoubleNumbers() {
        // Given
        Calculator calculator = new Calculator();
        // When
        double resultToCheck = calculator.mod(17.0, 4);
        // Then
        assertThat(resultToCheck).isEqualTo(4.25);
    }
}

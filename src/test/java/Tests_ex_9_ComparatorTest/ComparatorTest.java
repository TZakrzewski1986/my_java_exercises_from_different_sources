package Tests_ex_9_ComparatorTest;

import My_Work.java_1_Chruściel_Manual.ex_9_comparator.Comparator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ComparatorTest {
    @Test
    public void shouldReturnCompare() {
        // Given
        String text = "text";
        String textToCompare = "text";

        Comparator comparator = new Comparator();
        // When
        boolean result = comparator.compare(text, textToCompare);
        // Then
        assertThat(result).isTrue();
    }

    @Test
    public void shouldCheckThatTwoStringsAreDifferent() {
        // Given
        String text = "text";
        String textToCompare = "TEXT123";

        Comparator comparator = new Comparator();
        // When
        boolean result = comparator.areDifferent(text, textToCompare);
        // Then
        assertThat(result).isTrue();
    }

    @Test
    public void shouldShowThatFirstNumberIsLowerThanSecond() {
        // Given
        int number = 10;
        int numberToCompare = 20;

        Comparator comparator = new Comparator();
        // When
        boolean result = comparator.isLower(number, numberToCompare);
        // Then
        assertThat(result).isTrue();
    }

    @Test
    public void shouldReturnThatFirstNumberIsGreaterThanSecond() {
        // Given
        int number = 10;
        int numberToCompare = 5;

        Comparator comparator = new Comparator();
        // When
        boolean result = comparator.isGreater(number, numberToCompare);
        // Then
        assertThat(result).isTrue();
    }
}

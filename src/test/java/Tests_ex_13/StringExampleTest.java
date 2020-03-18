package Tests_ex_13;

import My_Work.java_1_Chruściel_Manual.ex_13_concat.StringExample;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringExampleTest {

    @Test
    public void shouldConcatTwoStrings() {
        // Given
        StringExample stringExample = new StringExample();
        // When
        String testString = stringExample.concat("One ", "Two");
        // Then
        assertThat(testString).isEqualTo("One Two");
    }

    @Test
    public void shouldReturnValueOf() {
        // When
        String result = String.valueOf(10);
        // Then
        assertThat(result).isEqualToIgnoringCase("10");
    }

    @Test
    public void shouldReturnTrim() {
        // Given
        String testExample = "  trim  ";
        // When
        String result = testExample.trim();
        // Then
        assertThat(result).isEqualToIgnoringCase("trim");
    }

    @Test
    public void shouldReturnToUpper() {
        // Given
        String testExample = "uppercase";
        // When
        String result = testExample.toUpperCase();
        // Then
        assertThat(result).isEqualTo("UPPERCASE");
    }

    @Test
    public void shouldReturnToCharArray() {
        // Given
        String testExample = "tablica";
        // When
        char resultCharArray[] = testExample.toCharArray();
        // Then
        assertThat(resultCharArray).hasSize(7);
        assertThat(resultCharArray[3]).isEqualTo('l');
    }

    @Test
    public void shouldReturnToSubstring() {
        // Given
        String testExample = "first1second2third";
        // when
        String result = testExample.substring(5);
        // Then
        assertThat(result).isEqualTo("1second2third");
    }

    @Test
    public void shouldReturnToSubstringFromTo() {
        // Given
        String testExample = "first1second2third";
        // When
        String result = testExample.substring(6, 12);
        // Then
        assertThat(result).isEqualTo("second");
    }
}

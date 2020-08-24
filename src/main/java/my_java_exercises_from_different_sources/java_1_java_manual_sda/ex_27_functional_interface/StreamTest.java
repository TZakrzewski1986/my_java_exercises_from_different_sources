package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_27_functional_interface;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamTest {

    @Test
    void shouldReturnWordsHigherThanFiveCharsInUpperCase() {
        // Given
        Stream<String> stringStream = Stream.of("first", "second", "third", "fourth", "fifth");
        // When
        List<String> result = stringStream.filter(x -> x.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        // Then
        assertThat(result). hasSize(2);
        assertThat(result).contains("SECOND", "FOURTH");
    }

    @Test
    void shouldReturnWordsHigherThanSeven() {
        // Given
        Stream<String> stringStream = Stream.of("first", "second", "third", "fourth", "fifth");
        // When
        Optional<String> result = stringStream.filter(x -> x.length() > 7)
                .findFirst();
        // Then
        assertThat(result).isNotNull();
        assertThat(result.isPresent()).isFalse();
    }

    @Test
    void shouldReturnEvenNumbers() {
        // Given
        Stream<Integer> numbers = Stream.of(1, 26, 30, 2, 45);
        // When
        List<Integer> result = numbers.filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        // Then
        assertThat(result).hasSize(3);
        assertThat(result).contains(26, 30, 2);
    }

    @Test
    void shouldReturnMaxNumbers() {
        // Given
        IntStream numbers = IntStream.of(1, 26, 30, 2, 45);
        // When
        OptionalInt max = numbers.max();
        // Then
        assertThat(max).isNotNull();
        assertThat(max.getAsInt()).isEqualTo(45);
    }

    @Test
    void shouldReturnNumbersHigherThanTwentySixAsString() {
        // Given
        Stream<Integer> numbers = Stream.of(1, 26, 30, 2, 45);
        // When
        List<String> result = numbers.filter(x -> x > 26)
                .map(String::valueOf)
                .collect(Collectors.toList());
        // Then
        assertThat(result).hasSize(2);
        assertThat(result).contains("30", "45");
    }
}

package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_24_set_listy;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;


public class SetTest {

    @Test
    void shouldReturnOnlyOneElement() {
        // Given
        HashSet<String> hashSet = new HashSet<>();
        // When
        hashSet.add("aaa");
        hashSet.add("bbb");
        hashSet.add("ccc");
        // Then
        assertThat(hashSet).hasSize(3);
        assertThat(hashSet).contains("aaa");
    }


}

package My_Work.java_1_Chruściel_Manual.ex_24_set_listy;

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

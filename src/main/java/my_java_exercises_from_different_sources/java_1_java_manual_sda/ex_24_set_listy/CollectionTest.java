package My_Work.java_1_Chruściel_Manual.ex_24_set_listy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionTest {

    @Test
    void shouldReturnCorrectFrequency() {
        // Given
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        // When
        int frequency = Collections.frequency(list, 1);
        // Then
        assertThat(frequency).isEqualTo(4);
        System.out.println(list);
    }

    @Test
    void shouldReturnCorrectMaxValue() {
        // Given
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(10);
        list.add(6);
        // When
        int max = Collections.max(list);
        // Then
        assertThat(max).isEqualTo(10);
    }

    @Test
    void shouldReturnCorrectMinValue() {
        // Given
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(10);
        list.add(6);
        // When
        int min = Collections.min(list);
        // Then
        assertThat(min).isEqualTo(1);
    }

    @Test
    void shouldReturnReverseList(){
        // Given
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(10);
        list.add(6);
        // When
        Collections.reverse(list);
        // Then
        assertThat(list.get(0)).isEqualTo(6);
    }

}

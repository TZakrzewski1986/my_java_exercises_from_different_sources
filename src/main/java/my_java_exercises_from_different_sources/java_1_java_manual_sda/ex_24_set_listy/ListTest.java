package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_24_set_listy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ListTest {

    @Test
    void shouldReturnSize() {
        // Given
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        // When
        int value = arrayList.size();

        // Then
        assertThat(value).isEqualTo(1);

    }

    @Test
    void shouldTrueWhenIsEmpty() {
        // Given
        ArrayList<String> arrayList = new ArrayList<>();
        // When
        boolean value = arrayList.isEmpty();
        // Then
        assertThat(value).isTrue();
    }

    @Test
    void shouldTrueWhenAddCorrectly() {
        // Given
        ArrayList<String> arrayList = new ArrayList<>();
        // When
        boolean add = arrayList.add("aaa");
        // Then
        assertThat(add).isTrue();
    }

    @Test
    void shouldReturnNewSizeAfterAddAll() {
        // Give
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayListToAdd = new ArrayList<>();
        arrayListToAdd.add("aaa");
        // When
        boolean addAll = arrayList.addAll(arrayListToAdd);
        // Then
        assertThat(addAll).isTrue();
    }

    @Test
    void shouldReturnTrueWhenListContainsElement() {
        // Given
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        // When
        boolean contains = arrayList.contains("aaa");
        // Then
        assertThat(contains).isTrue();
    }

    @Test
    void shouldReturnCorrectElement() {
        // Given
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        // When
        String value = arrayList.get(0);
        // Then
        assertThat(value).isEqualToIgnoringCase("aaa");
    }

}

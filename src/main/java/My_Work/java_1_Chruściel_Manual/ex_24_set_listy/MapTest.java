package My_Work.java_1_Chruściel_Manual.ex_24_set_listy;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class MapTest {

    @Test
    void shouldPutNewElement() {
        // Given
        Map<String, String> hashMap = new HashMap<>();
        // When
        hashMap.put("key", "aaa");
        // Then
        assertThat(hashMap.get("key")).isEqualTo("aaa");

    }

    @Test
    void  shouldPutAllElements() {
        // Given
        Map<String, String> map = new HashMap<>();
        Map<String, String> newMap = new HashMap<>();
        map.put("key", "value");
        // When
        map.putAll(newMap);
        // Then
        assertThat(map.get("key")).isEqualTo("value");
    }

    @Test
    void shouldReturnTrueWhenMapContainsKey() {
        // Given
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        // When
        boolean containsKey = map.containsKey("key");
        // Then
        assertThat(containsKey).isTrue();
        System.out.println(map);
    }

    @Test
    void shouldReturnRemovedElement() {
        // Given
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        // When
        String value = map.remove("key");
        // Then
        assertThat(value).isEqualTo("value");
        System.out.println(map);
    }

    @Test
    void shouldReturnGetElement() {
        // Given
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        // When
        String value = map.get("key");
        // Then
        assertThat(value).isEqualTo("value");
        System.out.println(map);
    }
}

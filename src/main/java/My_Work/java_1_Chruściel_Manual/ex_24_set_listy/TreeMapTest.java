package My_Work.java_1_Chruściel_Manual.ex_24_set_listy;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.assertj.core.api.Assertions.assertThat;

public class TreeMapTest {

    @Test
    void shouldSortNewKeysOnTreeMap() {
        // Given
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        // When
        treeMap.put(2, "value");
        treeMap.put(3, "value");
        treeMap.put(1, "value");
        // Then
        assertThat(treeMap.firstKey()).isEqualTo(1);
        System.out.println(treeMap);
    }

    @Test
    void shouldSortNewKeysOnMap() {
        // Given
        Map<Integer, String> treeMap = new TreeMap<>();
        // When
        treeMap.put(2, "value");
        treeMap.put(3, "value");
        treeMap.put(1, "value");
        treeMap.put(2, "value");
        // Then
        assertThat(getFirstElementFrom(treeMap)).isEqualTo(1);
        System.out.println(treeMap);
    }

    private int getFirstElementFrom(Map<Integer, String> treeMap) {
        for (Map.Entry<Integer, String> entry :treeMap.entrySet()) {
            return entry.getKey();
        }
        return 0;
    }

}

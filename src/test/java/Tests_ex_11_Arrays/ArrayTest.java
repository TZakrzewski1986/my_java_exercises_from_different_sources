package Tests_ex_11_Arrays;

import my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_11_arrays.ArrayExample;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArrayTest {

    @Test
    public void shouldReturnIndexValue() {
        // Given
        ArrayExample arrayExample = new ArrayExample();
        // When
        int arrayIndex = arrayExample.tab[3];
        // Then
        assertThat(arrayIndex).isEqualTo(8);
    }

    @Test
    public void shouldReturnStringTabIndexValue() {
        // Given
        ArrayExample arrayExample = new ArrayExample();
        // When
        String arrayIndex = arrayExample.tabStringWithoutValues[1];
        // Then
        assertThat(arrayIndex).isNull();
    }

    @Test
    public void shouldReturnVarargsSize() {
        // Given
        ArrayExample arrayExample = new ArrayExample();
        // When
        int tabValues = arrayExample.manyArgs();
        // Then
        assertThat(tabValues).isEqualTo(0);
    }

    @Test
    public void shouldReturnNewVarargsSize() {
        // Given
        ArrayExample arrayExample = new ArrayExample();
        // When
        int tabValues = arrayExample.manyArgs("D", "U", "P", "A");
        // Then
        assertThat(tabValues).isEqualTo(4);
    }
}

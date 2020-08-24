package Tests_ex_5_Autoboxing;

import my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_6_autoboxing.Autoboxing;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AutoboxingTest {

    @Test
    public void shouldReturnAutoBoxingExampleValue() {
        // Given
        Autoboxing autoboxing = new Autoboxing();
        // When
        Integer result = autoboxing.autoboxingExample;
        // Then
        assertThat(result).isEqualTo(1);
    }
}

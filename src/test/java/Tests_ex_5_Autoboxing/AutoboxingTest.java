package Tests_ex_5_Autoboxing;

import My_Work.java_1_Chruściel_Manual.ex_6_autoboxing.Autoboxing;
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

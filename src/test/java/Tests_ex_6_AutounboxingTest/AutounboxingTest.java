package Tests_ex_6_AutounboxingTest;

import my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_7_autounboxing.Autounboxing;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AutounboxingTest {

    @Test
    public void shouldReturnAutounboxedValue() {
        // Given
        Autounboxing autounboxing = new Autounboxing();
        // When
        int result = autounboxing.autounboxingExample;
        // Then
        assertThat(result).isEqualTo(12);
    }
}

package Tests_ex_6_AutounboxingTest;

import My_Work.java_1_Chruściel_Manual.ex_7_autounboxing.Autounboxing;
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

package Tests_ex_15_elementy_statyczne;

import my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_17_elementy_statyczne.MonthConstants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MonthConstantsTest {
    private MonthConstants monthConstants;

    @BeforeEach
    void setUp() {monthConstants = new MonthConstants();}

    @Test
    public void shouldReturnCorrectStaticMonthName() {
        // When
        String result = monthConstants.getMonthByName(2);
        // Then
        assertThat(result).isEqualToIgnoringCase("February");
    }


}

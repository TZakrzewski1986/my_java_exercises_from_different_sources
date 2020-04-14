package Tests_ex_14_instrukcje_warunkowe;

import My_Work.java_1_Chruściel_Manual.ex_16_instrukcje_warunkowe.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConditionTest {

    private Condition condition;

    @BeforeEach
    void setUp() {
        condition = new Condition();
    }

    @Test
    public void shouldReturnTrueWhenGivenNumberIsEven() {
        // When
         boolean result = condition.isEven(12);
        // Then
        assertThat(result).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenGivenNumberIsOdd() {
        // When
        boolean result = condition.isOdd(11);
        // Then
        assertThat(result).isTrue();
    }

    @Test
    public void shouldReturnCorrectNumberWhenGivenNumberIsDivisebleBySeven() {
        // When
        int divisible = condition.divisible(49);
        // Then
        assertThat(divisible).isEqualTo(7);
    }

    @Test
    public void shouldReturnCorrectMonthName() {
        // When
        String result = condition.getMonthNameBy(1);
        // Then
        assertThat(result).isEqualToIgnoringCase("January");
    }
}

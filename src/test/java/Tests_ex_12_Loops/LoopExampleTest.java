package Tests_ex_12_Loops;

import my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_12_loops.LoopExample;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoopExampleTest {

    LoopExample loopExample;

    @BeforeEach
    public void setUp() {
        loopExample = new LoopExample();
    }

    @Test
    public void shouldFillArrayWithValues() {
        // When
        int[] testArray = loopExample.fillFor(5);
        // Then
        assertThat(testArray).hasSize(5);
        assertThat(testArray[4]).isEqualTo(4);
        System.out.println(Arrays.toString(testArray));
    }

    @Test
    public void shouldFillArrayViaLoopWhile() {
        // When
        int[] testArray = loopExample.fillWhile(5);
        // Then
        assertThat(testArray).hasSize(5);
        assertThat(testArray[2]).isEqualTo(2);
        System.out.println(Arrays.toString(testArray));
    }

    @Test
    public void shouldFillArrayViaLoopDoWhile() {
        // When
        int[] testArray = loopExample.fillDoWhile(5);
        // Then
        assertThat(testArray).hasSize(5);
        assertThat(testArray[2]).isEqualTo(3);
        System.out.println(Arrays.toString(testArray));
    }
}

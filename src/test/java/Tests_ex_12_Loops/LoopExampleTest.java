package Tests_ex_12_Loops;

import My_Work.java_1_Chruściel_Manual.loops.LoopExample;
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
}

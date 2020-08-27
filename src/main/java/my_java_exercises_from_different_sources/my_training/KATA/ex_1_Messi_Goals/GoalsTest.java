package my_java_exercises_from_different_sources.my_training.KATA.ex_1_Messi_Goals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoalsTest {
    @Test
    public void BasicTests() {
        assertEquals(58, Goals.totalGoals);
    }
}

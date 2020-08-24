package My_Work.my_training.KATA.ex_2_Greetings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WelcomeTest {
    @Test
    public void shouldReturnGreetings() {
        // Given
        Welcome welcome = new Welcome();
        // When
        String result = welcome.greet("french");
        // Then
        assertThat(result).isEqualTo("Bienvenue");
    }
}

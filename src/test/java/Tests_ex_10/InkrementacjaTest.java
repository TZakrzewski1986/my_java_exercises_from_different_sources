package Tests_ex_10;

import My_Work.java_1_Chruściel_Manual.ex_10.Inkrementacja;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InkrementacjaTest {
    @Test
     public void shouldAddOneToNumber() {
        // Given
        Inkrementacja inkrementacja = new Inkrementacja();
        // When
        int resultToCheck = inkrementacja.addOne(1);
        // Then
        assertThat(resultToCheck).isEqualTo(2);
    }

    @Test
    public void shouldSubOneFromNumber() {
        // Given
        Inkrementacja inkrementacja = new Inkrementacja();
        // When
        int resultToCheck = inkrementacja.subOne(2);
        // Then
        assertThat(resultToCheck).isEqualTo(1);
    }



}

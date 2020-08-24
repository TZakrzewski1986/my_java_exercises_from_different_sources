package Tests_ex1;

import my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_3.Car;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CarTest {

    @Test
    public void shouldReturnCorrectCarName() {
        //Given
        Car maluch = new Car(4, "Maluch");
        //When
        String carName = maluch.carName;
        //Then
        assertThat(carName).isEqualTo("Maluch");

    }

    @Test
    public void shouldReturnCorrectWheelPrice() {
        //Given
        Car maluch = new Car(6, "Maluch");
        //When
        int totalWheelPrice = maluch.getTotalWheelPrice(20);
        //Then
        assertThat(totalWheelPrice).isEqualTo(120);

    }

    @Test
    public void shouldReturnDefaultWheelNumber() {
        //Given
        Car maluch = new Car(4, "Maluch");
        //When
        int numberOfWheels = maluch.getNumberOfWheels();
        //Then
        assertThat(numberOfWheels).isEqualTo(4);


    }
}

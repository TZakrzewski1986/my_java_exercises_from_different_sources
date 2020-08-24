package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_3;

public class Car {
    public int numberOfWheels = 4;
    public String carName;

    public Car(int numberOfWheels, String carName) {
        this.numberOfWheels = numberOfWheels;
        this.carName = carName;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getTotalWheelPrice(int wheelPrice) {
        return numberOfWheels * wheelPrice;
    }


}

package My_Work.java_1_Chruściel_Manual.ex_3;

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

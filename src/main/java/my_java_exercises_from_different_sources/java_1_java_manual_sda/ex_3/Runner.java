package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_3;

public class Runner {
    public static void main(String[] args) {
        Car maluch = new Car(4, "Maluch");
        System.out.println("Ilość kół: " + maluch.getTotalWheelPrice(4));

        Car scania = new Car(8, "Scania");
        System.out.println("Ilość kół: " + scania.getNumberOfWheels());
    }
}

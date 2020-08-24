package My_Work.java_1_Chruściel_Manual.ex_3;

public class Runner {
    public static void main(String[] args) {
        Car maluch = new Car(4, "Maluch");
        System.out.println("Ilość kół: " + maluch.getTotalWheelPrice(4));

        Car scania = new Car(8, "Scania");
        System.out.println("Ilość kół: " + scania.getNumberOfWheels());
    }
}

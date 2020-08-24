package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_18_interface;

public class Person {
    void driveBy(Vehicle vehicle) {
        vehicle.drive();
    }

    void buyTicketsFor(Payable payable, int quantity) {
        payable.pay(quantity);
    }

}

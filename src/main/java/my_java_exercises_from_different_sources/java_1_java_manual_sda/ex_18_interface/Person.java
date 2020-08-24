package My_Work.java_1_Chruściel_Manual.ex_18_interface;

public class Person {
    void driveBy(Vehicle vehicle) {
        vehicle.drive();
    }

    void buyTicketsFor(Payable payable, int quantity) {
        payable.pay(quantity);
    }

}

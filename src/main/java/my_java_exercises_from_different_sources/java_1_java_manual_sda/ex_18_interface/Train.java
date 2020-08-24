package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_18_interface;

public class Train implements Vehicle, Payable {
    private static final double value = 25.50;

    @Override
    public void drive() {
        System.out.println("Drive by train");
    }

    @Override
    public void pay(int quantity) {
        System.out.println(quantity * value);
    }
}

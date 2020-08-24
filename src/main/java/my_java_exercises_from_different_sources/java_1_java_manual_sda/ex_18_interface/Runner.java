package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_18_interface;

public class Runner {
    public static void main(String[] args) {
        Person person = new Person();
        Car car = new Car();
        Bus bus = new Bus();
        Train train = new Train();

        person.driveBy(car);
        person.driveBy(bus);
        person.driveBy(train);
        person.buyTicketsFor(train, 10 );
        person.buyTicketsFor(bus, 15);
    }
}

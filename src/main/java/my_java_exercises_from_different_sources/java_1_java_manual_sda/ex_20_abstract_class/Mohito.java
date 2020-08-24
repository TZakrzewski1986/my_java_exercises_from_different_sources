package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_20_abstract_class;

public class Mohito extends Drink {

    @Override
    void showName() {
        System.out.println("Mohito");
    }

    @Override
    void addWater(){
        System.out.println("Add 20 ml of water");
    }

    @Override
    void addAlcohol() {
        System.out.println("Add 50 ml of alcohol");

    }

    @Override
    void addJuice() {
        System.out.println("Add lemon juice");

    }

    @Override
    void addIce() {
        System.out.println("Add two ice-cubes");

    }
}

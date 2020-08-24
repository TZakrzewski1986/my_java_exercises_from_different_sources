package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_25_generics;

public class Runner {

    public static void main(String[] args) {
        Chef<Beef> beefChef = new Chef<>();
        Chef<Nudle> nudleChef = new Chef<>();
        Chef<Cabbage> cabbageChef = new Chef<>();

        Beef beef = new Beef("Beef", "100");
        beefChef.prepareMeal(beef);

        Nudle nudle = new Nudle("Nudle", "100");
        nudleChef.prepareMeal(nudle);

        Cabbage cabbage = new Cabbage("Cabbage", "100");
        cabbageChef.prepareMeal(cabbage);


    }
}

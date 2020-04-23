package My_Work.java_1_Chruściel_Manual.ex_25_generics;

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

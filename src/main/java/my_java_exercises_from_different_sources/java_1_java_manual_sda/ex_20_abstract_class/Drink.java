package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_20_abstract_class;

public abstract class Drink {

    abstract void showName();

    abstract void addWater();

    abstract void addAlcohol();

    abstract void addJuice();

    abstract void addIce();

    public void prepareDrink() {
        showName();
        addWater();
        addAlcohol();
        addJuice();
        addIce();
    }
}

package My_Work.java_1_Chruściel_Manual.ex_20_abstract_class;

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

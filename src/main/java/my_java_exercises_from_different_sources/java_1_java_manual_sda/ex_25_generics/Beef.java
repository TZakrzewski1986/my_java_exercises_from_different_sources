package My_Work.java_1_Chruściel_Manual.ex_25_generics;

public class Beef extends Food {

    protected Beef(String name, String weight) {
        super(name, weight);
    }

    @Override
    void prepare() {
        System.out.println(name);
    }
}

package My_Work.java_1_Chruściel_Manual.ex_25_generics;

public class Nudle extends Food {

    protected Nudle(String name, String weight) {
        super(name, weight);
    }

    @Override
    void prepare() {
        System.out.println(name);
    }

}

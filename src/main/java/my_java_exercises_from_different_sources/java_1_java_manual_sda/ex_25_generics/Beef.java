package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_25_generics;

public class Beef extends Food {

    protected Beef(String name, String weight) {
        super(name, weight);
    }

    @Override
    void prepare() {
        System.out.println(name);
    }
}

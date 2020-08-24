package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_25_generics;

public abstract class Food {
    protected final String name;
    protected  final  String weight;

    protected Food(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    abstract void prepare();
}

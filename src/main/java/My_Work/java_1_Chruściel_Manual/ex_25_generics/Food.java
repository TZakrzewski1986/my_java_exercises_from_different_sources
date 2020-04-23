package My_Work.java_1_Chruściel_Manual.ex_25_generics;

public abstract class Food {
    protected final String name;
    protected  final  String weight;

    protected Food(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    abstract void prepare();
}

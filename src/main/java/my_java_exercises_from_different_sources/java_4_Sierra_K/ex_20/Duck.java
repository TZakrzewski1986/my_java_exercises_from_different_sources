package my_java_exercises_from_different_sources.java_4_Sierra_K.ex_20;

public class Duck {
    int size;

    Duck() {
        System.out.println("Kwak");
        size = 10;
    }

    Duck(int outOfNormalSize) {
        System.out.println("KwAAAk!");
        size = outOfNormalSize;

    }

    public void setSize(int duckSize) {
        size = duckSize;
    }
}

package my_java_exercises_from_different_sources.my_training.practice.ex_16;

class M {
    int i = 51;

    public M(int j) {
        System.out.println(i);
        this.i = j * 10;
    }
}

class N extends M {
    public N(int j) {
        super(j);
        System.out.println(i);
        this.i = j * 20;
    }
}

public class MainClass {
    public static void main(String[] args) {
        N n = new N(26);
        System.out.println(n.i);
    }
}

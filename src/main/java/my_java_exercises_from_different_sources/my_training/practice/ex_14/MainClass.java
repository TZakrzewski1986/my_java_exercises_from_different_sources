package my_java_exercises_from_different_sources.my_training.practice.ex_14;

class M {
    static {
        System.out.println("A");
    }

    {
        System.out.println("B");
    }

    public M() {
        System.out.println("C");
    }
}

class N extends M {
    static {
        System.out.println("D");
    }

    {
        System.out.println("E");
    }

    public N() {
        System.out.println("F");
    }
}

public class MainClass {
    public static void main(String[] args) {
        N n = new N();
    }
}

package my_java_exercises_from_different_sources.my_training.practice.ex_10;

class A {
    static {
        System.out.println("THIRD");
    }
}

class B extends A {
    static {
        System.out.println("TWO");
    }
}

class C extends B {
    static {
        System.out.println("ONE");
    }
}

public class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}

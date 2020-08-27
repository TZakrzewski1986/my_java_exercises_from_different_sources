package my_java_exercises_from_different_sources.my_training.practice.ex_20;

class A {
    void A() {
        System.out.println(1);
    }
}

class B extends A {
    void B() {
        A();
    }
}

public class MainClass {
    public static void main(String[] args) {
        new B().B();
    }
}

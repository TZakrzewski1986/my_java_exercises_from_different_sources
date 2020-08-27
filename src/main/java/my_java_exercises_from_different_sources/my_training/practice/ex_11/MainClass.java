package my_java_exercises_from_different_sources.my_training.practice.ex_11;

class A {
    public A() {
        System.out.println("Class A constructor");
    }
}

class B extends A {
    public B() {
        System.out.println("Class B constructor");
    }
}

class C extends B {
    public C() {
        System.out.println("Class C constructor");
    }
}

public class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}

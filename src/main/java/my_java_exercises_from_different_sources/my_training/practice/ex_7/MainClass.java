package my_java_exercises_from_different_sources.my_training.practice.ex_7;

class A {
    int i = 10;
}

class B extends A {
    int i = 20;
}

public class MainClass {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a.i);
        System.out.println(b.i);
    }
}

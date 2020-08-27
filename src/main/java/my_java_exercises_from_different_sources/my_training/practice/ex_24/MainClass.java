package my_java_exercises_from_different_sources.my_training.practice.ex_24;

class A {
    int methodofA(int i) {
        i /= 10;
        return i;
    }
}

class B extends A {
    int methodofB(int i) {
        i *= 20;
        return methodofA(i);
    }
}

public class MainClass {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.methodofB(100));
    }
}

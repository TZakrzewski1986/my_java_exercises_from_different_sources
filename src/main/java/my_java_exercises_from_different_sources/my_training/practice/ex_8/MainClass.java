package my_java_exercises_from_different_sources.my_training.practice.ex_8;

class A {
    {
        System.out.println(1);
    }
}

class B extends A {
    {
        System.out.println(2);
    }
}

class C extends B {
    {
        System.out.println(3);
    }
}

public class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}

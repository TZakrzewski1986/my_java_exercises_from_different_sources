package my_java_exercises_from_different_sources.my_training.practice.ex_9;

class A {
    String s = "Class A";
}

class B extends A {
    String s = "Class B";

    {
        System.out.println(super.s);
    }
}

class C extends B {
    String s = "Class C";

    {
        System.out.println(super.s);
    }
}

public class MainClass {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.s);
    }
}

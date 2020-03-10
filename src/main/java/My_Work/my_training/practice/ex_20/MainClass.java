package My_Work.my_training.practice.ex_20;

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

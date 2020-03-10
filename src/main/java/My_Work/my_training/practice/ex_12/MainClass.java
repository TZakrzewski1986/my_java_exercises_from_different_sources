package My_Work.my_training.practice.ex_12;

class X {
    static void staticMethod() {
        System.out.println("Class X");
    }
}

class Y extends X {
    static void staticMethod() {
        System.out.println("Class Y");
    }
}

public class MainClass {
    public static void main(String[] args) {
        {
            Y.staticMethod();
        }
    }
}

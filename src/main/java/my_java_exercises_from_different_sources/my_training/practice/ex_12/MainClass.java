package my_java_exercises_from_different_sources.my_training.practice.ex_12;

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

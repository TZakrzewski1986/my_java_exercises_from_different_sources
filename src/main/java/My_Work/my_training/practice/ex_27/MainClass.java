package My_Work.my_training.practice.ex_27;

class X {
    static {
        Y.methodOfY();
    }
}

class Y extends X {
    static void methodOfY() {
        System.out.println("Hi....");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Y.methodOfY();
    }
}

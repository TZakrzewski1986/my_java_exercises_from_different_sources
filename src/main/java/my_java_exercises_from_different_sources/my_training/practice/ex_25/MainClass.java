package My_Work.my_training.practice.ex_25;

class A {
    static int i;

    static {
        i++;
    }

    {
        ++i;
    }
}

class B extends A {
    static {
        --i;
    }

    {
        i--;
    }
}

public class MainClass {
    public static void main(String[] args) {
        System.out.println(new B().i);
    }
}

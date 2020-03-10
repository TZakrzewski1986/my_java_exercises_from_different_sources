package My_Work.my_training.practice.ex_23;

class A {
    int[] a = new int[5];

    {
        a[0] = 10;
    }
}

public class MainClass extends A {
    {
        a = new int[5];
    }

    {
        System.out.println(a[0]);
    }

    public static void main(String[] args) {
        MainClass main = new MainClass();
    }
}

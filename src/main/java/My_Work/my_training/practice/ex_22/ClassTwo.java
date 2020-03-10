package My_Work.my_training.practice.ex_22;

class ClassOne {
    static int i = 191919;
    static int j = 191919;

    {
        --i;
    }

    {
        j++;
    }
}

public class ClassTwo extends ClassOne {
    static {
        i++;
    }

    static {
        --j;
    }

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(j);
    }
}

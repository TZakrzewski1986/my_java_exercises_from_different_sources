package My_Work.java_4_Sierra_K.ex_9;

public class Triangle {
    double field;
    int high;
    int length;

    public static void main(String[] args) {
        int x = 0;
        Triangle[] ta = new Triangle[4];
        while (x < 4) {
            ta[x] = new Triangle();
            ta[x].high = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].getField();
            System.out.print("trójkąt" + x + ", pole");
            System.out.println(" = " + ta[x].field);
            x = x + 1;
        }
        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].field = 343;
        System.out.print("y = " + y);
        System.out.println(", pole t5 = " + t5.field);
    }

    void getField() {
        field = (high * length) / 2;
    }
}

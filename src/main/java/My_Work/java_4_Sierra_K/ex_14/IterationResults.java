package My_Work.java_4_Sierra_K.ex_14;

public class IterationResults {
    public static void main(String[] args) {
        IterationResults w = new IterationResults();
        w.doIt();
    }

    void doIt() {
        int y = 7;
        for (int x = 1; x < 8; x++) {
            y++;
            if (x > 4) {
                System.out.print(++y + " ");
            }
            if (y > 14) {
                System.out.print(" x = " + x);
                break;
            }
        }
    }
}

package My_Work.java_4_Sierra_K.ex_16;

public class LoopsFor {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int zewn = 0; zewn < 3; zewn++) {
            for (int wewn = 4; wewn > 1; wewn--){
                x = x + 6;
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}

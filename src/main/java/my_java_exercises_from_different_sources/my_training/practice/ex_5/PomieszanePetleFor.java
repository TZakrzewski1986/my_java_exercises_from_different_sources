package my_java_exercises_from_different_sources.my_training.practice.ex_5;

public class PomieszanePetleFor {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int zewn = 0; zewn < 3; zewn++) {
            for (int wewn = 4; wewn > 1; wewn--) {
                x = x + 3;
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

package my_java_exercises_from_different_sources.my_training.practice.ex_36;

public class Tolls {
    private static int yesterday = 1;
    int tomorrow = 10;

    public static void main(String[] args) {
        Tolls tolls = new Tolls();
        int today = 20, tomorrow = 40;
        System.out.println(today + tolls.tomorrow + tolls.yesterday);
    }
}

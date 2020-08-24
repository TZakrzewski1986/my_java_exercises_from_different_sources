package My_Work.java_4_Sierra_K.ex_20;

public class DuckRunner {
    public static void main(String[] args) {
        Duck duckOne = new Duck();
        Duck duckTwo = new Duck(15);

        System.out.println(duckOne.size);
        System.out.println(duckTwo.size);
    }
}

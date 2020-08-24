package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_12_loops;

public class LoopExample {

    public int[] fillFor(int value) {
        int[] values = new int[value];
        for (int i = 0; i < value; i++){
            values[i] = i;
        }
        return values;
    }

    public int[] fillWhile(int value) {
       int[] values = new int[value];
       int counter = 0;
       while (counter < value) {
           values[counter] = counter;
           counter++;
       }
       return values;
    }

    public int[] fillDoWhile(int value) {
        int[] values = new int[value];
        int counter = 0;
        do {
            values[counter] = counter + 1;
            counter++;
        }
        while (counter < value);
        return values;
    }
}

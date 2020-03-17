package My_Work.java_1_Chruściel_Manual.loops;

public class LoopExample {

    public int[] fillFor(int value) {
        int[] values = new int[value];
        for (int i = 0; i < value; i++){
            values[i] = i;
        }
        return values;
    }
}

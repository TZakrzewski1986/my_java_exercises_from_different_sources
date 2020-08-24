package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_11_arrays;

public class ArrayExample {
    public int[] tab = {1, 2, 3, 8, 5};

    public int[] tabIntWithoutValues = new int[5];

    public String[] tabStringWithoutValues = new String[5];

    public int manyArgs(String ... strings) {
        return strings.length;
    }


}



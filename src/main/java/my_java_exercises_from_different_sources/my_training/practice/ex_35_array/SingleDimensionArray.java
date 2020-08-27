package my_java_exercises_from_different_sources.my_training.practice.ex_35_array;

public class SingleDimensionArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Rozmiar tablicy: " + array.length);
        System.out.println(array[3]);

        System.out.println("Zawatość tablicy:");
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();

        int length = array.length;
        int max = array[0];
        int sum = 0;

        for (int i = 0; i < length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            sum += array[i];
        }
        System.out.println("Największa liczna w tablicy to " + max);
        System.out.println("Suma liczb w tablicy to " + sum);
        System.out.println("Srednia liczb z liczb w tablicy to " + (sum/length));



    }
}

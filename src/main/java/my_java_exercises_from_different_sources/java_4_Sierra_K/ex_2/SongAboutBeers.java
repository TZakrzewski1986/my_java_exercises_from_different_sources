package my_java_exercises_from_different_sources.java_4_Sierra_K.ex_2;

public class SongAboutBeers {
    public static void main(String[] args) {

        int amountOfBottles = 99;
        String word = "bottels";
        while (amountOfBottles > 0) {
            if (amountOfBottles == 1) {
                word = "bottel";
            }
            System.out.println(amountOfBottles + " " + word + " of beer on the wall!");
            System.out.println(amountOfBottles + " " + word + " of beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            amountOfBottles = amountOfBottles - 1;
        }
        System.out.println("No more bottles on the wall");
    }
}

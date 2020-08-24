package my_java_exercises_from_different_sources.java_4_Sierra_K.ex_5;

public class Gamer {

    int numberToGuess = 0;

    public void chooseNumber() {
        numberToGuess = (int) (Math.random() * 10);
        System.out.println("Mój wybór to " + numberToGuess);
    }
}

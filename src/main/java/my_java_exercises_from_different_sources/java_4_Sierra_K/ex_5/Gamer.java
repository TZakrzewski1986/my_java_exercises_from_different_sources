package My_Work.java_4_Sierra_K.ex_5;

public class Gamer {

    int numberToGuess = 0;

    public void chooseNumber() {
        numberToGuess = (int) (Math.random() * 10);
        System.out.println("Mój wybór to " + numberToGuess);
    }
}

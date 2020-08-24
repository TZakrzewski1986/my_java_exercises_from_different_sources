package my_java_exercises_from_different_sources.java_4_Sierra_K.ex_3;

public class GreatSpeaker {
    public static void main(String[] args) {

        String[] wordsList1 = {"Dupa", "Japa", "Kanapa"};
        String[] wordsList2 = {"to", "z", "w"};
        String[] wordsList3 = {"nic", "wszystko", "chuj z tym"};

        int wordsList1Length = wordsList1.length;
        int wordsList2Length = wordsList2.length;
        int wordsList3Length = wordsList3.length;

        int randomWordFromArray1 = (int) (Math.random() * wordsList1Length);
        int randomWordFromArray2 = (int) (Math.random() * wordsList2Length);
        int randomWordFromArray3 = (int) (Math.random() * wordsList3Length);

        String neededSentence = wordsList1[randomWordFromArray1] + " " + wordsList2[randomWordFromArray2] + " "
                + wordsList3[randomWordFromArray3];

        System.out.println("To jest to czego na potrzeba: " + neededSentence);
    }

}

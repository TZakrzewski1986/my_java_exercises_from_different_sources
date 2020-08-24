package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_27_functional_interface;

public class IsOdd implements IsOddPredicate{

    @Override
    public boolean isOdd(int numberToCheck) {
        return numberToCheck % 2 !=0;
    }
}

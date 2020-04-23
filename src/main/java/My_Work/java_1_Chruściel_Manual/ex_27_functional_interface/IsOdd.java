package My_Work.java_1_Chruściel_Manual.ex_27_functional_interface;

public class IsOdd implements IsOddPredicate{

    @Override
    public boolean isOdd(int numberToCheck) {
        return numberToCheck % 2 !=0;
    }
}

package My_Work.java_1_Chruściel_Manual.ex_2_bank;

import My_Work.java_1_Chruściel_Manual.ex_2_bank.pko.alior.BankAlior;
import My_Work.java_1_Chruściel_Manual.ex_2_bank.pko.ing.BankING;

public class Runner {
    public static void main(String[] args) {
        BankAlior alior = new BankAlior();
        System.out.println(alior.returnInformation());
        BankING ing = new BankING();
        System.out.println(ing.returnInformation());
    }
}

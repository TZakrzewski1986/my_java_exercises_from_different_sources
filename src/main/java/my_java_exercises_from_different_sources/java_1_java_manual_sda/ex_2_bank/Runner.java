package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_2_bank;

import my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_2_bank.pko.alior.BankAlior;
import my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_2_bank.pko.ing.BankING;

public class Runner {
    public static void main(String[] args) {
        BankAlior alior = new BankAlior();
        System.out.println(alior.returnInformation());
        BankING ing = new BankING();
        System.out.println(ing.returnInformation());
    }
}

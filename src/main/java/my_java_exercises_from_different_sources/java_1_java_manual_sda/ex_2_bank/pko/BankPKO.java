package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_2_bank.pko;

import my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_2_bank.Bank;

public class BankPKO extends Bank {
    private final int rateOfInterest = 9;

    protected int getRateOfInterest() {
        return rateOfInterest;
    }
}

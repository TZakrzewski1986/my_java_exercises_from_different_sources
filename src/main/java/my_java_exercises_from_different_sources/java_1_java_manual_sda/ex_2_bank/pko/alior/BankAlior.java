package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_2_bank.pko.alior;

import my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_2_bank.pko.BankPKO;

public class BankAlior extends BankPKO {
    private final String bankAlior = "Bank Alior";

    private int returnCommission() {
        return 10 + getRateOfInterest();
    }

    public String returnInformation() {
        return bankAlior + " " + returnCommission();
    }
}

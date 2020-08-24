package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_2_bank.pko.ing;

import my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_2_bank.pko.BankPKO;

public class BankING extends BankPKO {
    private final String bankING = "Bank ING";

    private int returnCommission() {
        return 15 + getRateOfInterest();
    }

    public String returnInformation() {
        return bankING + " " + returnCommission();
    }
}

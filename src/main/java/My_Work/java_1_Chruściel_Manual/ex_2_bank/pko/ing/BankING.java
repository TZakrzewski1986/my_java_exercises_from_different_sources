package My_Work.java_1_Chruściel_Manual.ex_2_bank.pko.ing;

import My_Work.java_1_Chruściel_Manual.ex_2_bank.pko.BankPKO;

public class BankING extends BankPKO {
    private String bankING = "Bank ING";

    private int returnCommission() {
        return 15 + getRateOfInterest();
    }

    public String returnInformation() {
        return bankING + " " + returnCommission();
    }
}

package My_Work.java_1_Chruściel_Manual.ex_2_bank.pko.alior;

import My_Work.java_1_Chruściel_Manual.ex_2_bank.pko.BankPKO;

public class BankAlior extends BankPKO {
    private String bankAlior = "Bank Alior";

    private int returnCommission() {
        return 10 + getRateOfInterest();
    }

    public String returnInformation() {
        return bankAlior + " " + returnCommission();
    }
}

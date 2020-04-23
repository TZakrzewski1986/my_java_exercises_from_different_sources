package My_Work.java_1_Chruściel_Manual.ex_25_generics;

public class Chef<T extends Food> {

    void prepareMeal(T foodToPrepare) {
        foodToPrepare.prepare();
    }
}

package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_25_generics;

public class Chef<T extends Food> {

    void prepareMeal(T foodToPrepare) {
        foodToPrepare.prepare();
    }
}

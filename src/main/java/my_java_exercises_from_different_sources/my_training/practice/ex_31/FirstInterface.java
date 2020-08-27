package my_java_exercises_from_different_sources.my_training.practice.ex_31;

public interface FirstInterface {
    String getName();

}

interface SecondInterface extends FirstInterface {
    String getSurname();

}

interface ThirdInterface extends FirstInterface, SecondInterface {
    int getAge();

}

interface FourthInterface extends FirstInterface, SecondInterface, ThirdInterface {
    int getWeight();

}



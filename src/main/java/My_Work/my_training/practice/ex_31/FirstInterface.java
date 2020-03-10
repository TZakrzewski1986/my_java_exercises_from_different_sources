package My_Work.my_training.practice.ex_31;

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



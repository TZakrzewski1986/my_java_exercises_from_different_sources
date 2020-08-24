package My_Work.java_4_Sierra_K.ex_10;

public class GoodDogTester {
    public static void main(String[] args) {

        GoodDog firstDog = new GoodDog();
        GoodDog secondDog = new GoodDog();

        firstDog.setAge(3);
        secondDog.setAge(6);

        System.out.println("Pierwszy pies: " + firstDog.getAge());
        System.out.println("Drugi pies: " + secondDog.getAge());

        firstDog.bark();
        secondDog.bark();

        GoodDog[] goodDogs;
        goodDogs = new GoodDog[2];
        goodDogs[0] = new GoodDog();
        goodDogs[1] = new GoodDog();

        goodDogs[0].setAge(3);
        int x = goodDogs[0].getAge();
        System.out.println("Pierwszy pies z tablicy: " + x);

        goodDogs[1].setAge(7);
        int y = goodDogs[1].getAge();
        System.out.println("Drugi pies z tablicy: " + y);

        goodDogs[0].bark();
        goodDogs[1].bark();


    }
}

package my_java_exercises_from_different_sources.java_4_Sierra_K.ex_10;

public class GoodDog {
    private int age;

    int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public void bark() {
        if (age <= 5) {
            System.out.println("Hiau hiau");
        } else {
            System.out.println("Hau hau");
        }
    }

}

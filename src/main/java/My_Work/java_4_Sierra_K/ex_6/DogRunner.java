package My_Work.java_4_Sierra_K.ex_6;

public class DogRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.age = 3;
        dog.name = "Puszek";

        System.out.println(dog.name);
        System.out.println(dog.age);

        dog.bark();
    }
}

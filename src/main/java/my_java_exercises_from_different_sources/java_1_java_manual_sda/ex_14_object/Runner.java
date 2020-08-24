package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_14_object;

public class Runner {
    public static void main(String[] args) {
        ObjectExample objectExample = new ObjectExample();
        System.out.println(objectExample.getClass());
        System.out.println(objectExample.hashCode());
        System.out.println(objectExample.toString());

        ToStringObjectExample toStringObjectExample = new ToStringObjectExample();
        System.out.println(toStringObjectExample.toString());
        System.out.println(toStringObjectExample);

    }
}

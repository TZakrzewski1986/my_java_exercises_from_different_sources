package My_Work.java_1_Chruściel_Manual.ex_14_object;

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

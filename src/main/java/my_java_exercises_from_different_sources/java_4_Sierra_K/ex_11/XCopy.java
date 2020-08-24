package my_java_exercises_from_different_sources.java_4_Sierra_K.ex_11;

public class XCopy {
    public static void main(String[] args) {
        int org = 42;
        XCopy x = new XCopy();
        int y = x.jazda(org);
        System.out.println(org + " " + y);
    }

    int jazda(int arg) {
        arg = arg * 2;
        return arg;
    }
}

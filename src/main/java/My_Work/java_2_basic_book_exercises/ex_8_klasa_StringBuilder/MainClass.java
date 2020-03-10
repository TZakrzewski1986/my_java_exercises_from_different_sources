package My_Work.java_2_basic_book_exercises.ex_8_klasa_StringBuilder;

public class MainClass {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("T");
        builder.append("y");
        builder.append(" chuju!");
        String completedString = builder.toString();
        System.out.println(builder);
    }
}

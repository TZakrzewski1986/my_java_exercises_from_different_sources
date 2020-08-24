package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_17_elementy_statyczne;

public class Runner {
    public static void main(String[] args) {
        Author author = new Author.AuthorBuilder("Jan")
                .age(50)
                .city("Katowice")
                .lastName("Nowak")
                .build();
    }
}

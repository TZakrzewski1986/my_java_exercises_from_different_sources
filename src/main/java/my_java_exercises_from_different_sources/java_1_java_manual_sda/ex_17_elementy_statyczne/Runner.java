package My_Work.java_1_Chruściel_Manual.ex_17_elementy_statyczne;

public class Runner {
    public static void main(String[] args) {
        Author author = new Author.AuthorBuilder("Jan")
                .age(50)
                .city("Katowice")
                .lastName("Nowak")
                .build();
    }
}

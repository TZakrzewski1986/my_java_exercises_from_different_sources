package my_java_exercises_from_different_sources.java_1_java_manual_sda.ex_17_elementy_statyczne;

public class Author {
    private final String firstName;
    private final String lastName;
    private final String city;
    private final int age;

    private Author(final AuthorBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.city = builder.city;
        this.age = builder.age;
    }

    static class AuthorBuilder {
        private final String firstName;
        private String lastName;
        private String city;
        private int age;

        public AuthorBuilder (String firstName) {
            this.firstName = firstName;
        }

        public AuthorBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public AuthorBuilder city(String city) {
            this.city = city;
            return this;
        }

        public AuthorBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Author build() {
            return new Author(this);
        }


    }
}

package my_java_exercises_from_different_sources.java_3_advance_java_Marcisz_Patryk.ex_1;

public class Member {

    private final String name;
    private final String email;
    private final int id;

    private static Integer common_id = 0;

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
        id = ++common_id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }
}

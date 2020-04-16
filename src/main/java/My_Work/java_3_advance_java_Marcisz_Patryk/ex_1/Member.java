package My_Work.java_3_advance_java_Marcisz_Patryk.ex_1;

public class Member {

    private String name;
    private String email;
    private int id;

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

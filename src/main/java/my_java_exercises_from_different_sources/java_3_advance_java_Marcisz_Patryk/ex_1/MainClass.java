package my_java_exercises_from_different_sources.java_3_advance_java_Marcisz_Patryk.ex_1;

public class MainClass {
    public static void main(String[] args) {
        Member m1 = new Member("Patryk", "p@m.pl");
        Member m2 = new Member("Ola", "o@.pl");
        Member m3 = new Member("Zią", "z@.pl");
        Member m4 = new Member("Kurą", "k@.pl");

        System.out.println(m1.getName());
        System.out.println(m1.getEmail());
        System.out.println(m1.getId());

        System.out.println(m2.getName());
        System.out.println(m2.getEmail());
        System.out.println(m2.getId());

        System.out.println(m3.getName());
        System.out.println(m3.getEmail());
        System.out.println(m3.getId());

        System.out.println(m4.getName());
        System.out.println(m4.getEmail());
        System.out.println(m4.getId());

        Team teamPatryk = new Team("TeamPatryk", m1, m2, m3, m4);
        Member[] members2And4 = teamPatryk.getMembers(2, 4);
        for (Member member : members2And4) {
            System.out.println(member == m4);
            System.out.println(member.getEmail());
        }


    }
}

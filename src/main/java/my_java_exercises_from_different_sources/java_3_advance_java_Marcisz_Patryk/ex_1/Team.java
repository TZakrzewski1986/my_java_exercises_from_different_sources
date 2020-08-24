package my_java_exercises_from_different_sources.java_3_advance_java_Marcisz_Patryk.ex_1;

public class Team {

    private final String name;
    private final Member[] members;

    public Team(String name, Member...members) {
        this.name = name;
        this.members = new Member[members.length];
        for (int i = 0; i < members.length; i++) {
            this.members[i] = members[i];
        }
    }

    public int getCount() {return members.length;}

    public Member[] getMembers() {return this.members;}

    public Member[] getMembers(int ... ids) {
        Member[] toReturn = new Member[ids.length];
        for (int i=0; i<ids.length; i++) {
            int currentId = ids[i];
            for (Member member : members) {
                if (member.getId() == currentId) {
                    toReturn[i] = member;
                }
            }
        }
        return toReturn;
    }



}

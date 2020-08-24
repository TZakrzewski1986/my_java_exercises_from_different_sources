package My_Work.java_4_Sierra_K.ex_7;

public class PercussionTester {
    public static void main(String[] args) {
        Percussion p = new Percussion();
        p.playOnDrums();
        p.drums = false;
        if (p.drums == true) {
            p.playOnDrums();
        }
        p.playOnPlates();
    }
}

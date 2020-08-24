package my_java_exercises_from_different_sources.java_4_Sierra_K.ex_22;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortowanieGór {

    LinkedList<Góra> mtn = new LinkedList<Góra>();

    class NazwaCompare implements Comparator<Góra> {
        public int compare(Góra g1, Góra g2) {
            return g1.nazwa.compareTo(g2.nazwa);
        }
    }

    class WysokoscCompare implements Comparator<Góra> {
        public int compare(Góra g1, Góra g2) {
            return (g2.wysokosc - g1.wysokosc);
        }
    }

    public static void main(String[] args) {
        new SortowanieGór().doDzieła();
    }

    public void doDzieła() {
        mtn.add(new Góra("Kasprowy", 1987));
        mtn.add(new Góra("Kościelec", 2155));
        mtn.add(new Góra("Swinica", 2301));
        mtn.add(new Góra("Rysy", 2499));
        System.out.println("Bez sortowania: \n" + mtn);
        NazwaCompare nc = new NazwaCompare();
        Collections.sort(mtn, nc);
        System.out.println("Wg. nazwy: \n" + mtn);
        WysokoscCompare wc = new WysokoscCompare();
        Collections.sort(mtn, wc);
        System.out.println("Wg. wysokosci: \n" + mtn);
    }

}

class Góra{

    String nazwa;
    int wysokosc;

    public Góra(String nazwa, int wysokosc) {
        this.nazwa = nazwa;
        this.wysokosc = wysokosc;
    }

    @Override
    public String toString() {
        return "Góra{" +
                "nazwa='" + nazwa + '\'' +
                ", wysokosc=" + wysokosc +
                '}';
    }
}



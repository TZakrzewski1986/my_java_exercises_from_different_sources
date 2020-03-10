package My_Work.my_training.practice.ex_6;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Jajko> mojaTbl = new ArrayList<Jajko>();
        Jajko j = new Jajko();
        mojaTbl.add(j);
        Jajko k = new Jajko();
        mojaTbl.add(k);
        int ilosc = mojaTbl.size();
        System.out.println(ilosc);
        boolean czyJest = mojaTbl.contains(j);
        System.out.println(czyJest);
        int indeks = mojaTbl.indexOf(k);
        System.out.println(indeks);
        boolean czyPusta = mojaTbl.isEmpty();
        System.out.println(czyPusta);
        mojaTbl.remove(j);
        System.out.println(mojaTbl.isEmpty());
    }
}


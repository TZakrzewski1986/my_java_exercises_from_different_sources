package My_Work.java_4_Sierra_K.ex_5;

public class GuessGame {

    Gamer gamer1;
    Gamer gamer2;
    Gamer gamer3;

    public void StartGame() {
        gamer1 = new Gamer();
        gamer2 = new Gamer();
        gamer3 = new Gamer();

        int gamersTry1 = 0;
        int gamersTry2 = 0;
        int gamersTry3 = 0;

        boolean gamer1Answer = false;
        boolean gamer2Answer = false;
        boolean gamer3Answer = false;

        int gameRandomNumber = (int) (Math.random() * 10);
        System.out.println("Wylosowana liczba to: " + gameRandomNumber);

        while (true) {
           gamer1.chooseNumber();
           gamer2.chooseNumber();
           gamer3.chooseNumber();

           gamersTry1 = gamer1.numberToGuess;
            System.out.println("Gracz nr 1 wybrał liczbę: " + gamersTry1);
           gamersTry2 = gamer2.numberToGuess;
            System.out.println("Gracz nr 2 wybrał liczbę: " + gamersTry2);
           gamersTry3 = gamer3.numberToGuess;
            System.out.println("Gracz nr 3 wybrał liczbę: " + gamersTry3);

            if (gamersTry1 == gameRandomNumber) {
                gamer1Answer = true;
            }
            if (gamersTry2 == gameRandomNumber) {
                gamer2Answer = true;
            }
            if (gamersTry3 == gameRandomNumber) {
                gamer2Answer = true;
            }
            if (gamer1Answer || gamer2Answer || gamer3Answer) {
                System.out.println("Mamy zwyciężcę!");
                System.out.println("Gracz 1 " + gamer1Answer);
                System.out.println("Gracz 2 " + gamer2Answer);
                System.out.println("Gracz 3 " + gamer3Answer);
                System.out.println("Koniec gry");
                break;
            } else {
                System.out.println("Trzeba losować jeszcze raz");
            }

        }
    }

}

package p25_08_2023;

public class Zadatak8 {
    public static void main(String[] args) {

//Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int).
//1 - I
//2 - II
//3 - III
//4 - IV
//5 - V
//Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
//Ako se unese V vraca se 5. Ako se unese vrednost koja nije podrzana vracamo nulu.

        int arapski = broj("V");
        System.out.println(arapski);

    }

    public static int broj(String rimski) {
        if (rimski.equals("I")) return 1;
        else if (rimski.equals("II")) return 2;
        else if (rimski.equals("III")) return 3;
        else if (rimski.equals("IV")) return 4;
        else if (rimski.equals("V")) return 5;


        return 0;
    }

}

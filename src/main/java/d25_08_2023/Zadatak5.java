package d25_08_2023;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji.
//Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost.
//U glavnom programu pozvati funkciju za neki od primera.
//Primer poziva funkcija:
//Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//Primer izvrsenja main programa:
//Unesite vrednost u eurima: 3
//Unesite valutu za konverziju: RSD
//3 EUR je 351.6339 RSD
//Konverzija eura u druge valute:
//1 EUR = 117.5 RSD
//1 EUR = 1.1 USD
//1 EUR = 62.98 RUB

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite vrednost u evrima: ");
        int vrednost = s.nextInt();
        System.out.print("Unesite valutu za konverziju: ");
        String valuta = s.next();
        double iznosKonverzije = konverzija(vrednost, valuta);

        System.out.print(vrednost + " EUR je ");
        printkonverzija(iznosKonverzije);
        System.out.println(" " + valuta);
    }

    public static double konverzija (int a, String b) {
        if (b.equals("RSD")) {return 117.5 * a;}
        else if (b.equals("USD")){return 1.1 * a;}
        else if (b.equals("RUB")){return 62.98 * a;}
        else return 0;
    }

    public static void printkonverzija(double a) {
        System.out.print(a);

    }
}

package vezba;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//Napisati metodu koja vrsi konverziju metara u cm, dm, km. Metoda kao parametre
//prima vrednost u metrima i jedinicu u kojoj treba izvrsiti konverziju i vraca
//konvertovanu vrednost.
//Podsetnik za konverziju jedinica:
//1m = 100 cm
//1m = 10 dm
//1m = 0.001 km
//Primer poziva metode
//Ako se u metodu prosledi vrednost 15 i jedinica cm, metoda vraca 1500.
//Ako se u metodu prosledi vrednost 1500 i jedinica km, metoda vraca 1.5
//U glavnom programu pozvati metodu za konverziju cm, dm i km i ispisati
//odgovarajuce poruke na ekranu.
//Primer izvrsenja programa:
//3.5m je 350cm
//3.5m je 35dm
//3.5m je 0.0035km

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite vrednost u metrima: ");
        double vrednost = s.nextDouble();
        System.out.print("Unesite jedinicu za konverziju: ");
        String valuta = s.next();
        double iznosKonverzije = konverzija(vrednost, valuta);

        printkonverzija(vrednost, "m je ", iznosKonverzije, valuta);
    }

    public static double konverzija(double a, String b) {
        if (b.equals("cm")) {
            return 100.0 * a;
        } else if (b.equals("dm")) {
            return 10.0 * a;
        } else if (b.equals("km")) {
            return 0.001 * a;
        } else return 0;
    }

    public static void printkonverzija(double a, String b, double c, String d) {
        System.out.print(a + b + c + d);
    }
}
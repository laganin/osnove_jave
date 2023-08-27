package d25_08_2023;

import java.util.Scanner;

public class Zadatak2_1 {
    public static void main(String[] args) {

//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        int novaVrednost = dvajednocifrena(14, 1);
    }

    public static int dvajednocifrena(int prviBroj, int drugiBroj) {
        if (prviBroj < 10 && drugiBroj < 10) {
            return (prviBroj * 10) + drugiBroj;
        } else return 0;
    }
}

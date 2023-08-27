package d25_08_2023;

import java.util.Scanner;

public class Zadatak2_3 {
    public static void main(String[] args) {
        //Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        String novaVrednost = dvajednocifrena("15", "2");
    }

    public static String dvajednocifrena(String prviBroj, String drugiBroj) {
        if (prviBroj.length() == 1 && (drugiBroj.length() == 1)) {
            return prviBroj + drugiBroj;
        } else return "Brojevi nisu jednocifreni.";
    }
}

package d25_08_2023;

import java.util.Scanner;

public class Zadatak2_2 {
    public static void main(String[] args) {

//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        String prviBroj = s.next();
        System.out.print("Unesite drugi broj: ");
        String drugiBroj = s.next();
        String novaVrednost = dvajednocifrena(prviBroj, drugiBroj);
    }

    public static String dvajednocifrena(String a, String b) {
        if (a.length() == 1 && (b.length() == 1)) {
            return a + b;}
        else return "Brojevi nisu jednocifreni.";
    }
}
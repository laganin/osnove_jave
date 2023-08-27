package d25_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int prviBroj = s.nextInt();
        System.out.print("Unesite drugi broj: ");
        int drugiBroj = s.nextInt();
        int novaVrednost = dvajednocifrena(prviBroj, drugiBroj);
    }

    public static int dvajednocifrena(int a, int b) {
        if (a < 10 && b < 10) {
            return (a * 10) + b;
        } else return 0;
    }
}
package p21_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//        Napisati program koji od korisnika ucitava N brojeva  i ispisuje sumu tih brojeva. N nam kaze koliko broja ce korisnik da unese.
//                Primer izvrsenja:
//        Unesite N: 3
//        Unesite broj: 1
//        Unesite broj: 4
//        Unesite broj: 9
//        Suma je 14.

        Scanner s = new Scanner(System.in);
        int suma = 0;

        System.out.print("Unesite N: ");
        int N = s.nextInt();

        for (int i = 1; i <=N; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            suma = suma + broj;
            }

        System.out.println(suma);

    }
}

package p21_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

// Napisati program koji od korisnika ucitava N brojeva  i ispisuje koliko je parnih brojeva uneo korisnik. N nam kaze koliko broja ce korisnik da unese.
//Primer izvrsenja:
//Unesite N: 6
//Unesite broj: 2
//Unesite broj: 4
//Unesite broj: 9
//Unesite broj: 12
//Unesite broj: 8
//Unesite broj: 1
//		Uneto je 4 parna broja.

        Scanner s = new Scanner(System.in);
        int suma = 0;
        int parni = 0;

        System.out.print("Unesite N: ");
        int N = s.nextInt();

        for (int i = 1; i <=N; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            if (broj % 2 == 0) {
                broj = 1;
                parni = parni + broj;
            }
        }
        System.out.println(parni);

}}

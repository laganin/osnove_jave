package p21_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

//(ZA VEZBANJE)Napisati program koji od korisnika ucitava N jednocifrenih brojeva i od njih formira rezultujuci broj kao na primeru
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 2
//Unesite broj: 0
//Unesite broj: 4
//Unesite broj: 1
//Rezultujuci broj je 12041 (Promenljiva tipa int)

        Scanner s = new Scanner(System.in);
        int rezultat = 0;

        System.out.print("Unesite N: ");
        int N = s.nextInt();

        for (int i = 1; i <=N; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            rezultat = (rezultat + broj) * 10;
        }
        System.out.println(rezultat/10);

    }
}

package p07_09_2023.Zadatak1;

import java.util.Scanner;

public class Zadatak1 {

//		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.
//    Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
//
//    Primer izvrsenja:
//    Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//    Primalac: Marko Markovic, 840-23932-334, stanje: 200
//    Unesite sumu za transakciju: 500
//    Stanje nakon stransakcije
//    Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//    Primalac: Marko Markovic, 840-23932-334, stanje: 700


    public static void main(String[] args) {

        Racun a = new Racun();
        a.broj = "840-23932-323";
        a.imePrezime = "Ana Laganin";
        a.stanje = 1000;

        System.out.println("Posiljalac: " + a.imePrezime + ", " + a.broj + ", stanje:" + a.stanje);

        Racun b = new Racun();
        b.broj = "840-23932-320";
        b.imePrezime = "Ana Histerija";
        b.stanje = 1000000;

        System.out.println("Primalac: " + b.imePrezime + ", " + b.broj + ", stanje:" + b.stanje);

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite sumu za transakciju: ");
        int transakcija = s.nextInt();
        a.stanje=a.stanje-transakcija;
        b.stanje=b.stanje+transakcija;
        System.out.println("Posiljalac: " + a.imePrezime + ", " + a.broj + ", stanje:" + a.stanje);
        System.out.println("Primalac: " + b.imePrezime + ", " + b.broj + ", stanje:" + b.stanje);

    }
}

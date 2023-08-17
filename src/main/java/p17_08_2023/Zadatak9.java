package p17_08_2023;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

//(Za vezbanje) Napisati program za potrebe Makao igrice. Korisnik unosi 4 informacije:
//znak karte koja je na stolu
//broj karte koja je na stolu
//znak karte koju igrac zeli da odigra
//broj karte koju igrac zeli da odigra
//	i nakon toga se na ekranu ispisuje da li je potez ispravan. Potez je ispravan ukoliko se karta na stolu i odigrana karta poklapaju po znaku ili broju.
//
//	Znakovi karata: srce, kocka, list, detelina
//	Brojevi karata: 2,3,4,5,6,7,8,9,10,A,J,Q,K
//
//	Primer izvrsenja 1:
//	Znak karte na stolu: srce
//	Broj karte na stolu: A
//	Znak karte koju zelis da odigras: detelina
//	Broja karte koju zelis da odigras: A
//	Potez je validan.
//
//	Primer izvrsenja 2:
//Znak karte na stolu: srce
//	Broj karte na stolu: A
//	Znak karte koju zelis da odigras: srce
//	Broja karte koju zelis da odigras: K
//	Potez je validan.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite znak karte koja je na stolu: ");
        String znakSto = s.next();

        System.out.print("Broj karte na stolu: ");
        String brojSto = s.next();

        System.out.print("Znak karte koji zelis da odigras: ");
        String znakRuka = s.next();

        System.out.print("Broj karte koju zelis da odigras: ");
        String brojRuka = s.next();

//        if (znakSto.equals("srce") == znakRuka.equals("srce") || znakSto.equals("kocka") == znakRuka.equals("kocka") ||
//                znakSto.equals("list") == znakRuka.equals("list") || znakSto.equals("detelina") == znakRuka.equals("detelina")

    }
}

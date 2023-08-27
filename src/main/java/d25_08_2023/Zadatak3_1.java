package d25_08_2023;

import java.util.Scanner;

public class Zadatak3_1 {
    public static void main(String[] args) {
        //Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite JMBG ");
        String JMBG = s.next();
        System.out.print("Unesite ime: ");
        String ime = s.next();
        System.out.print("Unesite prezime: ");
        String prezime = s.next();
        System.out.print("Unesite godina rodjenja: ");
        String godinaRodjenja = s.next();
        System.out.print("Unesite da li je korisnik aktivan: ");
        boolean aktivan = s.nextBoolean();
        podaci(JMBG, ime, prezime, godinaRodjenja, aktivan);

    }

    public static void podaci(String JMBG, String ime, String Prezime, String godinaRodjenja, boolean aktivan) {
        System.out.println("JMBG: " + JMBG);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + Prezime);
        System.out.println("God. rodjenja: " + godinaRodjenja);
        System.out.println("Aktivan: " + aktivan);
    }
}

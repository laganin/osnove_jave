package vezba;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3_3 {
    public static void main(String[] args) {

//Napisati program koji simulira pretragu “IT Bootcamp” na guglu. Program cuva rezultate
//pretrage kao niz podataka (pogledaj link). Korisnik unosi stranu za prikaz i koliko hoce
//rezultata da bude prikazano na strani a zatim se rezultati pretrage prikazuju korisniku.
//Primer izvrsenja 1:
//Unesite stranu: 1
//Unesite broj rezultata po strani: 5
//Rezultati pretrage su:
//ITBootcamp - Besplatna IT prekvalifikacija - Free IT Bootcamp ...
//Prijava - Beograd - ITBootcamp
//IT Bootcamp kursevi
//IT Bootcamp - Education - Belgrade, Serbia - 1 Review - 342 ...
//IT Bootcamp - Образовање - Belgrade, Serbia - 1 утисак ...
//Primer izvrsenja 2:
//Unesite stranu: 3
//Unesite broj rezultata po strani: 3
//Rezultati pretrage su:
//Otvorene prijave za IT Bootcamp, program obuke ... - Startit
//Specijalizovani sistem za ŠKOLE SRBIJE - IT Bootcamp …
//Vesti - Početak rada neprofitne IT škole - IT Bootcamp

        Scanner s = new Scanner(System.in);
        ArrayList<String> rezultatiPretrage = new ArrayList<>();

        rezultatiPretrage.add("ITBootcamp - Besplatna IT prekvalifikacija - Free IT Bootcamp ...");
        rezultatiPretrage.add("Prijava - Beograd - ITBootcamp");
        rezultatiPretrage.add("IT Bootcamp kursevi");
        rezultatiPretrage.add("IT Bootcamp - Education - Belgrade, Serbia - 1 Review - 342 ...");
        rezultatiPretrage.add("IT Bootcamp - Образовање - Belgrade, Serbia - 1 утисак ...");
        rezultatiPretrage.add("IT Bootcamp | LinkedIn");
        rezultatiPretrage.add("Otvorene prijave za IT Bootcamp, program obuke ... - Startit");
        rezultatiPretrage.add("Specijalizovani sistem za ŠKOLE SRBIJE - IT Bootcamp ...");
        rezultatiPretrage.add("Vesti - Početak rada neprofitne IT škole - IT Bootcamp");
        rezultatiPretrage.add("Otvorene prijave za IT Bootcamp u Nišu : Ekonomija : Južne ...");

        System.out.print("Unesite stranu: ");
        int strana = s.nextInt();
        System.out.print("Unesite broj rezultata po strani: ");
        int brojRez = s.nextInt();

        for (int i = (brojRez * strana) - brojRez; i < brojRez * strana; i++) {
            String rezultatPoStrani = rezultatiPretrage.get(i);
            System.out.println(rezultatPoStrani);
        }


    }
}

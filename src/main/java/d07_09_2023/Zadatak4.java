package d07_09_2023;

public class Zadatak4 {
    public static void main(String[] args) {

//Kreiranje klase "Film"
//Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String). U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature.
//Ispisati informacije o filmovima.

        Film horor = new Film();
        Film akcija = new Film();
        Film komedija = new Film();

        horor.naslov = "Film broj 1";
        horor.godinaIzdanja = 2003;
        horor.reziser = "Luka Peric";

        akcija.naslov = "Film broj 2";
        akcija.godinaIzdanja = 1990;
        akcija.reziser = "Zdravko Kuzmanovic";

        komedija.naslov = "Film broj 3";
        komedija.godinaIzdanja = 1980;
        komedija.reziser = "Milan Jovanovic";

        System.out.println(akcija.reziser + ", " + akcija.godinaIzdanja + ", " + akcija.naslov);
        System.out.println(horor.reziser + ", " + horor.godinaIzdanja + ", " + horor.naslov);
        System.out.println(komedija.reziser + ", " + komedija.godinaIzdanja + ", " + komedija.naslov);

    }
}

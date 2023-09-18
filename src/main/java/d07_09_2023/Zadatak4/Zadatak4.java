package d07_09_2023.Zadatak4;

public class Zadatak4 {
    public static void main(String[] args) {

//Kreiranje klase "Film"
//Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String). U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature.
//Ispisati informacije o filmovima.

        Film horror = new Film();
        Film action = new Film();
        Film comedy = new Film();

        horror.title = "Movie title 1";
        horror.yearPublished = 2003;
        horror.directedBy = "Luka Peric";

        action.title = "Movie title 2";
        action.yearPublished = 1990;
        action.directedBy = "Zdravko Kuzmanovic";

        comedy.title = "Movie title 3";
        comedy.yearPublished = 1980;
        comedy.directedBy = "Milan Jovanovic";

        System.out.println(action.directedBy + ", " + action.yearPublished + ", " + action.title);
        System.out.println(horror.directedBy + ", " + horror.yearPublished + ", " + horror.title);
        System.out.println(comedy.directedBy + ", " + comedy.yearPublished + ", " + comedy.title);

    }
}

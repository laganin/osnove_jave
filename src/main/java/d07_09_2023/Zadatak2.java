package d07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

//Kreiranje klase "Automobil"
//Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int). U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti.
//Ispisati informacije o automobilima.

        Automobil a = new Automobil();
        Automobil b = new Automobil();

        a.godinaProizvodnje = 2003;
        a.model = "Fabia";
        a.marka = "Skoda";

        b.model = "X3";
        b.marka = "BMW";
        b.godinaProizvodnje = 2015;

        System.out.println(a.marka + ", " + a.model + ", " + a.godinaProizvodnje);
        System.out.println(b.marka + ", " + b.model + ", " + b.godinaProizvodnje);

    }
}

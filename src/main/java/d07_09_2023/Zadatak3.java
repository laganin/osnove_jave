package d07_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {

//Kreiranje klase "Proizvod"
//Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double). U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti. Ispisati informacije o proizvodima.

        Proizvod prehrana = new Proizvod();
        Proizvod pice = new Proizvod();
        Proizvod hemija = new Proizvod();

        prehrana.naziv = "Pasteta";
        prehrana.cena = 99.99;

        pice.naziv = "Coca-Cola";
        pice.cena = 149.99;

        hemija.naziv = "Ariel";
        hemija.cena = 328.55;

        System.out.println(hemija.naziv + ", " + hemija.cena);
        System.out.println(pice.naziv + ", " + pice.cena);
        System.out.println(prehrana.naziv + ", " + prehrana.cena);


    }
}

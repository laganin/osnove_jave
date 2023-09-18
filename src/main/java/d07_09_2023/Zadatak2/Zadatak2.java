package d07_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

//Kreiranje klase "Automobil"
//Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int). U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti.
//Ispisati informacije o automobilima.

        Car a = new Car();
        Car b = new Car();

        a.manufacturingYear = 2003;
        a.model = "Fabia";
        a.make = "Skoda";

        b.model = "X3";
        b.make = "BMW";
        b.manufacturingYear = 2015;

        System.out.println(a.make + ", " + a.model + ", " + a.manufacturingYear);
        System.out.println(b.make + ", " + b.model + ", " + b.manufacturingYear);

    }
}

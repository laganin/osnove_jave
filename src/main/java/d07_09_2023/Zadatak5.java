package d07_09_2023;

public class Zadatak5 {
    public static void main(String[] args) {

//Kreiranje klase "Oprema"
//Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double). U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture.
//Ispisati informacije o opremi.


        Oprema kosarka = new Oprema();
        Oprema tenis = new Oprema();
        Oprema odbojka = new Oprema();

        kosarka.marka = "Molten";
        kosarka.tip = "lopta";
        kosarka.cena = 999.99;

        tenis.marka = "Head";
        tenis.tip = "Reket";
        tenis.cena = 3499.99;

        odbojka.marka = "Mikasa";
        odbojka.tip = "lopta";
        odbojka.cena = 599.89;

        System.out.println(tenis.cena + ", " + tenis.tip + ", " + tenis.marka);
        System.out.println(kosarka.cena + ", " + kosarka.tip + ", " + kosarka.marka);
        System.out.println(odbojka.cena + ", " + odbojka.tip + ", " + odbojka.marka);
    }
}

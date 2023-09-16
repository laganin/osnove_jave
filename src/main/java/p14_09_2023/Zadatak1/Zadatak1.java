package p14_09_2023.Zadatak1;

public class Zadatak1 {

//Kreirati klasu Sastojak koja ima:
//naziv
//cenu
//gettere i settere
//konstruktore
//metodu za stampanje koja stampa  podatke u formatu:
//naziv - cena.din
//
//	Kreirati klasu Pasta koja ima:
//niz sastojaka
//metodu za dodavanje sastojka
//defaultni konstruktor
//metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//metodu za stampu koja stampa podatke u formatu:
//Pasta je sa sastojcima:
//naziv - cena.din
//naziv - cena.din
//naziv - cena.din
//Cena paste je <sracunata cena paste>.din
//
//U glavnom programu kreirati objekte i testirati funkcionalnosti
//
//
//(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.

    public static void main(String[] args) {

        Sastojak broj1 = new Sastojak("prvi sastojak", 100);
        Sastojak broj2 = new Sastojak("drugi sastojak", 200);

        Pasta bolonjez = new Pasta();

        bolonjez.dodajSastojak(broj1);
        bolonjez.dodajSastojak(broj1);
        bolonjez.dodajSastojak(broj2);
        bolonjez.obrisiSastojak("prvi sastojak");

        bolonjez.print();

    }

}

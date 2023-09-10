package d08_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena.
//Smatrati da je parametar popust u opsegu od 0 do 100.
//racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara,
//a cena postarine se računa u zavisnosti od tezine:
//za tezinu do 100g, postarina iznosi 200din
//za tezinu od 101g do 500g, postarina iznosi 400din
//za tezinu preko 500g, postarina iznosi 1000din
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.


        Proizvod knjiga = new Proizvod();
        Proizvod kostim = new Proizvod();

        knjiga.naziv = "Starac i more";
        knjiga.cena = 1000;
        knjiga.tezinaUGramima = 1000;
        knjiga.stampaj();

        kostim.naziv = "Barbie";
        kostim.cena = 500;
        kostim.tezinaUGramima = 100;
        kostim.stampaj();


        System.out.println();
        knjiga.povecajCenu(200);
        System.out.println("Cena knjige sa popustom je " + knjiga.vratiCenuSaPopustom(5));
        System.out.println("Postarina za slanje " + knjiga.naziv + " je " + knjiga.racunajPostarinu());
        knjiga.stampaj();
        System.out.println();

        kostim.povecajCenu(400);
        System.out.println("Cena kostima sa popustom je " + kostim.vratiCenuSaPopustom(23));
        System.out.println("Postarina za slanje " + kostim.naziv + " je " + kostim.racunajPostarinu());
        kostim.stampaj();


    }
}

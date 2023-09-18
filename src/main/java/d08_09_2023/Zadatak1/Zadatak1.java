package d08_09_2023.Zadatak1;

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


        Product knjiga = new Product();
        Product kostim = new Product();

        knjiga.name = "Old man and the sea";
        knjiga.price = 1000;
        knjiga.weight = 1000;
        knjiga.print();

        kostim.name = "Barbie";
        kostim.price = 500;
        kostim.weight = 100;
        kostim.print();


        System.out.println();
        knjiga.raisePrice(200);
        System.out.println("Book price with discount is " + knjiga.getPriceWithDiscount(5));
        System.out.println("Shipping cost for " + knjiga.name + " is " + knjiga.calcShipping());
        knjiga.print();
        System.out.println();

        kostim.raisePrice(400);
        System.out.println("Book price with discount is  " + kostim.getPriceWithDiscount(23));
        System.out.println("Shipping cost for " + kostim.name + " is " + kostim.calcShipping());
        kostim.print();


    }
}

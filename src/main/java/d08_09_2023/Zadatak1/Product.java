package d08_09_2023.Zadatak1;

public class Product {
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

    String name;
    double price;
    double weight; // in grams

    public void print() {
        System.out.println(this.name + ", " + this.price + ", " + this.weight);
    }

    public void raisePrice(int povecanje) {
        this.price = this.price + povecanje;
    }

    public double getPriceWithDiscount(double popust){
        return (this.price * (1.0-(popust/100)));
    }
    
    public int calcShipping(){
        if (this.weight >500){
            return 1000;
        }
        else if (this.weight <100) {
            return 200;
        }
        return 400;
    }
}

package p15_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji na ekranu stampa podatke u formatu:
//        Sifra [SIFRA PROIZVODA]
//        [NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//        [BOJA], [VELICINA]

        String sifraProizvoda = "neka sifra";
        String nazivProizvoda = "najbolji proizvod";
        int cena = 100;
        int popust = 10;
        String boja= "plava";
        String velicina = "XL";

        System.out.println("Sifra " + sifraProizvoda);
        System.out.println(nazivProizvoda + " - $" + cena + " - Popust " + popust + "%");
        System.out.println(boja + ", " + velicina);

    }
}

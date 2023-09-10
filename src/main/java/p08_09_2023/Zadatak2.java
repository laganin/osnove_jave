package p08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Auto auto = new Auto();

        auto.imePrezimeVozaca = "Milan Jovanovic";
        auto.marka = "BMW";
        auto.brojVrata = 5;
        auto.potrosnjaNa100km = 10;
        auto.trenutnaBrzina = 200;
        auto.maxBrzina = 240;
        auto.godinaProizvodnje = 2003;
        auto.mesecRegistracije = 7;
        auto.kubikaza = 1900;
        auto.stampaj();

        if (auto.prekoracio(100)) {
            System.out.println("Prekoracio je ogranicenje od 100.");
            System.out.println("Kazna je " + auto.kazna(100));
        } else {
            System.out.println("Nije prekoracio ogranicenje od 100.");
            System.out.println("Nema kazne");
        }

        System.out.println(auto.trenutnaPotrosnja());
        auto.stampajTablu();

        if (auto.oldtimer()) {
            System.out.println("Auto je oldtajmer.");
        } else System.out.println("Auto nije oldtajmer.");

        if (auto.isteklaRegistracija(9)) {
            System.out.println("Registracija je istekla.");
        } else System.out.println("Registracija nije istekla");

        System.out.println("Cena registracije je " + auto.cenaRegistracije());

        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();

        System.out.println(auto.trenutnaBrzina);

    }
}

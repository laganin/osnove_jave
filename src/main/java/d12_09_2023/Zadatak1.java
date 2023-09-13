package d12_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        FizickoLice kupac = new FizickoLice("1504962805057");
        FizickoLice prodavac = new FizickoLice("06039985805048");
        Ugovor stan = new Ugovor();

        kupac.setImePrezime("Perica Stojic");
        kupac.setLicnaKarta(987654321);
        kupac.setStaraMusterija(true);

        prodavac.setImePrezime("Anja Bozic");
        prodavac.setLicnaKarta(123654789);
        prodavac.setStaraMusterija(false);

        stan.setDatumSklapanja("13.09.2020.");
        stan.setProdavac(prodavac);
        stan.setKupac(kupac);
        stan.setCena(100);
        stan.setAdresaNekretnine("Vojvode Putnika 13, Novi Sad");

        stan.print();
    }
}

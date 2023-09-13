package d12_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        Racun posaljilac  = new Racun(65000);
        Racun primalac = new Racun(100000);
        Transakcija plata = new Transakcija(007);

        posaljilac.setBrojRacuna("moj racun broja 1");
        posaljilac.setImePrezimeVlasnika("Ana Laganin");
        primalac.setImePrezimeVlasnika("Radnik Bond");
        primalac.setBrojRacuna("njegov racun bez broja");
        plata.setPosaljilacRacun(posaljilac);
        plata.setPrimalacRacun(primalac);

        posaljilac.print();
        System.out.println();
        primalac.print();
        System.out.println();
        plata.prenos(4000);
        posaljilac.print();
        System.out.println();
        primalac.print();
    }




}

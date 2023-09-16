package p08_09_2023.Zadatak2;

public class Auto {

    String imePrezimeVozaca;
    String marka;
    int brojVrata;
    double potrosnjaNa100km;
    int trenutnaBrzina;
    int godinaProizvodnje;
    int mesecRegistracije;
    int kubikaza;
    String registracija;
    boolean ukljucenaKlima;
    int maxBrzina;

    public void stampaj() {
        System.out.println(this.imePrezimeVozaca);
        System.out.println(this.marka + " - " + this.brojVrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnjaNa100km + "l na 100km");
        System.out.println(this.trenutnaBrzina + " km/h je trenutna brzina.");
    }

    public boolean prekoracio(int ogranicenje) {
        return ogranicenje < this.trenutnaBrzina;
    }

    public int kazna(int ogranicenje) {
        if (this.prekoracio(ogranicenje)) {
            return (this.trenutnaBrzina - ogranicenje) * 1000;
        }
        return 0;
    }

    public boolean oldtimer() {
        return this.godinaProizvodnje < 1950;
    }

    public boolean isteklaRegistracija(int trenutniMesec) {
        return trenutniMesec > this.mesecRegistracije;
    }

    public double cenaRegistracije() {
        if (this.kubikaza > 2000) {
            return kubikaza * 100 * 1.3;
        }
        return kubikaza * 100;
    }

    public void dodajGas() {
        if (this.maxBrzina > this.trenutnaBrzina) {
            this.trenutnaBrzina = this.trenutnaBrzina + 10;
        }
    }

    public void koci() {
        this.trenutnaBrzina = this.trenutnaBrzina - 10;
        if (this.trenutnaBrzina < 0) {
            this.trenutnaBrzina = 0;
        }
    }

    public double trenutnaPotrosnja() {
        double faktorKlime = 1;
        if (this.ukljucenaKlima = true) {
            faktorKlime = 1.2;
        }
        return (this.trenutnaBrzina / 100.0 * this.potrosnjaNa100km) * faktorKlime;
    }

    public void stampajTablu() {
        int brzinomer = 100;
        int brojCrtica = (this.trenutnaBrzina * 100) / this.maxBrzina;
        for (int i = 0; i < brojCrtica; i++) {
            System.out.print("|");
        }
        for (int i = 0; i < brzinomer - brojCrtica; i++) {
            System.out.print(".");
        }
        System.out.println(this.trenutnaBrzina + "/" + this.maxBrzina + "km/h");
    }
}

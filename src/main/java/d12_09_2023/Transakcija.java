package d12_09_2023;

public class Transakcija {

    private int ID;
    private Racun posaljilacRacun;
    private Racun primalacRacun;

    public Transakcija(int ID) {
        this.ID = ID;
    }

    public double provizija(double iznos) {
        if (iznos < 4500) {
            return 45;
        } else return (iznos * 0.01);
    }

    public void prenos(double iznos) {

        if (this.posaljilacRacun.getStanje()>=iznos+provizija(iznos)){
        this.posaljilacRacun.skiniSaRacuna(iznos);}
        this.posaljilacRacun.skiniSaRacuna(provizija(iznos));
        this.primalacRacun.uplatiNaRacuna(iznos);

    }

    public void print() {
        System.out.println(this.ID);
        System.out.println("Racun sa " + this.posaljilacRacun.getImePrezimeVlasnika() + " - " + this.posaljilacRacun.getBrojRacuna());
        System.out.println("Racun na: " + this.primalacRacun.getImePrezimeVlasnika() + " - " + this.primalacRacun.getBrojRacuna());
    }

    public Racun getPosaljilacRacun() {
        return this.posaljilacRacun;
    }

    public void setPosaljilacRacun(Racun posaljilacRacun) {
        this.posaljilacRacun = posaljilacRacun;
    }

    public Racun getPrimalacRacun() {
        return this.primalacRacun;
    }

    public void setPrimalacRacun(Racun primalacRacun) {
        this.primalacRacun = primalacRacun;
    }
}
package d12_09_2023;

public class Racun {

    private String brojRacuna;
    private String imePrezimeVlasnika;
    private double stanje;

    public Racun (double stanje){
        this.stanje = stanje;

    }

    public void uplatiNaRacuna(double uplata){
        this.stanje = this.stanje + uplata;
    }

    public void skiniSaRacuna(double isplata){
        if (this.stanje>isplata){
        this.stanje = this.stanje - isplata;}
    }

    public void print (){
        System.out.println(this.imePrezimeVlasnika + " - " + this.brojRacuna);
        System.out.println("stanje na racunu je " + this.stanje + "RSD");
    }

    public String getBrojRacuna() {
        return this.brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImePrezimeVlasnika() {
        return this.imePrezimeVlasnika;
    }

    public void setImePrezimeVlasnika(String imePrezimeVlasnika) {
        this.imePrezimeVlasnika = imePrezimeVlasnika;
    }

    public double getStanje() {
        return this.stanje;
    }

}
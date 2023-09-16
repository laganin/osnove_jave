package p12_09_2023.Zadatak4;

public class Sastojak {

    private String naziv;
    private int cena;

    public Sastojak(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCena() {
        return this.cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }


}

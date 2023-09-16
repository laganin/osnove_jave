package p14_09_2023.Zadatak1;

public class Sastojak {

    private String naziv;
    private int cena;

    public Sastojak(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public void print() {
        System.out.println("Naziv sastojka: " + this.naziv + " - " + "cena: " + this.cena + ".din");
    }

    public String getNaziv() {
        return naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}

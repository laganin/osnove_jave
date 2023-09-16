package p11_09_2023.Zadatak3;

public class Film {

    private String naziv;
    private int godina;
    private Reziser reziser;

    public Film() {
    }

    public Film(String naziv, int godina) {
        this.naziv = naziv;
        this.godina = godina;
    }

    public void print() {
        System.out.println(this.naziv + ", " + this.godina);
        if (this.reziser != null) {
            System.out.println("Rezirao ga: " + this.reziser.getImePrezime() + ", " + this.reziser.getStarost());
        }
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return this.godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public Reziser getReziser() {
        return this.reziser;
    }

    public void setReziser(Reziser reziser) {
        this.reziser = reziser;
    }
}


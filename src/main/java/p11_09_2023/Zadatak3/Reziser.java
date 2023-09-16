package p11_09_2023.Zadatak3;

public class Reziser {

    private String imePrezime;
    private int starost;
    private Film reziraoFilm;

    public Reziser() {
    }

    public Reziser(String imePrezime, int starost) {
        this.imePrezime = imePrezime;
        this.starost = starost;
    }

    public Reziser(String imePrezime, int starost, Film reziraoFilm) {
        this.imePrezime = imePrezime;
        this.starost = starost;
        this.reziraoFilm = reziraoFilm;
    }

    public String getImePrezime() {
        return this.imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getStarost() {
        return this.starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public void print() {
        System.out.println(this.imePrezime + ", " + this.starost + "god.");
    }
}

package d12_09_2023;

public class Ugovor {

    private String datumSklapanja;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private int cena;
    private String adresaNekretnine;

    public double procenatZarade() {
        if (this.kupac.getStaraMusterija() == true) {
            return 0.02;
        }
        return 0.03;
    }

    public double zarada (){
        return 1000 + cena * this.procenatZarade();
    }

    public void print() {
        System.out.println("Dana " + this.datumSklapanja + "god sklopljen je ugovor izmedju " + this.prodavac.getImePrezime() + " i " + this.kupac.getImePrezime() + " o kupovini nekretnine " + this.adresaNekretnine + " po ceni od " + cena + " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednostu u iznosu od " + this.zarada());
    }

    public String getDatumSklapanja() {
        return this.datumSklapanja;
    }

    public void setDatumSklapanja(String datumSklapanja) {
        this.datumSklapanja = datumSklapanja;
    }

    public FizickoLice getProdavac() {
        return this.prodavac;
    }

    public void setProdavac(FizickoLice prodavac) {
        this.prodavac = prodavac;
    }

    public FizickoLice getKupac() {
        return this.kupac;
    }

    public void setKupac(FizickoLice kupac) {
        this.kupac = kupac;
    }

    public int getCena() {
        return this.cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getAdresaNekretnine() {
        return this.adresaNekretnine;
    }

    public void setAdresaNekretnine(String adresaNekretnine) {
        this.adresaNekretnine = adresaNekretnine;
    }

}

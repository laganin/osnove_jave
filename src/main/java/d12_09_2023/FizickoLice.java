package d12_09_2023;

public class FizickoLice {

    private String imePrezime;
    private int licnaKarta;
    private String JMBG;
    private boolean staraMusterija;

    public FizickoLice(String JMBG){
        this.JMBG = JMBG;
    }

    public void print() {
        System.out.println("Musterija: " + this.imePrezime + ", broj licne karte:" + this.licnaKarta);
    }

    public String getImePrezime() {
        return this.imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getLicnaKarta() {
        return this.licnaKarta;
    }

    public void setLicnaKarta(int licnaKarta) {
        this.licnaKarta = licnaKarta;
    }

    public String getJMBG() {
        return this.JMBG;
    }

    public boolean getStaraMusterija() {
        return this.staraMusterija;
    }

    public void setStaraMusterija(boolean staraMusterija) {
        this.staraMusterija = staraMusterija;
    }

}

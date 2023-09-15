package p15_09_2023;

public class Osoba {

    protected String imePrezime;
    protected String JMBG;

    public Osoba(String imePrezime, String JMBG) {
        this.imePrezime = imePrezime;
        this.JMBG = JMBG;
    }

    public void print (){
        System.out.println(this.imePrezime + ", " + this.JMBG);
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getJMBG() {
        return JMBG;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void setJMBG(String JMBG) {
        this.JMBG = JMBG;
    }
}

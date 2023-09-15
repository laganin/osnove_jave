package p15_09_2023;

public class Student extends Osoba{

    private String brojIndeksa;
    private int dugZaSkolarinu;

    public Student(String imePrezime, String JMBG, String brojIndeksa, int dugZaSkolarinu) {
        super (imePrezime, JMBG);
        this.brojIndeksa = brojIndeksa;
        this.dugZaSkolarinu = dugZaSkolarinu;
    }

    public void uplatiSkolarinu (int uplata){
        this.dugZaSkolarinu = this.dugZaSkolarinu - uplata;
    }
    @Override
    public void print(){
        super.print();
        System.out.println(this.brojIndeksa);
        System.out.println(this.dugZaSkolarinu);
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public int getDugZaSkolarinu() {
        return dugZaSkolarinu;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public void setDugZaSkolarinu(int dugZaSkolarinu) {
        this.dugZaSkolarinu = dugZaSkolarinu;
    }
}

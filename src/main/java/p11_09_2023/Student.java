package p11_09_2023;

public class Student {

//  gettere i settere za sve atributge

    // Getter
//  public String getName() {
//    return name;}

    // Setter
//  public void setName(String newName) {
//    this.name = newName;

    private String ime;
    private String prezime;
    private int brojIndeksa;
    private boolean budget;

    public void print() {
        System.out.println(this.ime + this.prezime + this.brojIndeksa + this.budget);
    }

    public String getIme() {
        return this.ime;
    }

    public void setIme(String novoIme) {
        this.ime = novoIme;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setPrezime(String novoPrezime) {
        this.prezime = novoPrezime;
    }

    public int getBrojIndeksa() {
        return this.brojIndeksa;
    }

    public void setBrojIndeksa(int noviBrojIndeksa) {
        this.brojIndeksa = noviBrojIndeksa;
    }

    public boolean getBudget() {
        return this.budget;
    }

    public void setBudget(boolean budget) {
        this.budget = budget;
    }

}

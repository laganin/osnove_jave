package p15_09_2023;

public class Profesor extends Osoba{

    private String predmet;
    private double plata;

    public Profesor(String imePrezime, String JMBG, String predmet, double plata) {
        super (imePrezime, JMBG);
        this.predmet = predmet;
        this.plata = plata;
    }

    public void povecajPlatu (double procenat){
        this.plata = this.plata + this.plata * procenat/100;
    }

    public void print(){
        super.print();
        System.out.println(this.predmet);
        System.out.println(this.plata);
    }

    public String getPredmet() {
        return predmet;
    }

    public double getPlata() {
        return plata;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }
}

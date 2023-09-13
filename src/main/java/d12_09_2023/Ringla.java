package d12_09_2023;

public class Ringla {

    private String tip; // obicna ili ekspres
    private double jacina; // obicna od 0 do 3 & ekspress od 0 do 12
    private double jacinaGrejaca;

    public Ringla (String tip, double jacinaGrejaca) {
        this.tip = tip;
        this.jacinaGrejaca = jacinaGrejaca;
        this.jacina = 0;
    }

    public double getJacina() {
        return this.jacina;
    }

    private int maxBrojPojacavanja() {
        if (tip.equals("obicna")) {
            return 3;
        }
        if (tip.equals("ekpres")) {
            return 12;
        }
        return 1;
    }

    public void pojacajRinglu() {
        if (tip.equals("obicna") & this.jacina < 3) {
            this.jacina = this.jacina + 1;
        }
        if (tip.equals("ekspres") & this.jacina < 12) {
            this.jacina = this.jacina + 1;
        }
    }

    public void iskljuciRinglu(){
        this.jacina = 0;
    }

    public boolean ringlaRadi(){
        return this.jacina>0;
    }

    public double potrosnjaRingle (double vreme){
        return 100 / this.maxBrojPojacavanja() * this.jacina * this.jacinaGrejaca * vreme;

    }

    public void print(){
        System.out.print("Ringla je ");
        if (this.ringlaRadi()){
            System.out.println("ukljucena");
        }
        else System.out.println("iskljucena");
        System.out.println("Tip ringle " + this.tip);
        System.out.println("Jacina " + this.jacina);
        System.out.println("Grejac " + this.jacinaGrejaca);
    }

}

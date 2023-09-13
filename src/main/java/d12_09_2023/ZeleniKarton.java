package d12_09_2023;

public class ZeleniKarton {

    private String imePrezimeStudenta;
    private int brojIndexa;
    private String nazivPredmeta;
    private String imePrezimeProfesora;
    private int ocena;

    public ZeleniKarton (String imePrezimeStudenta, int brojIndexa, String nazivPredmeta, String imePrezimeProfesora, int ocena){
        this.imePrezimeStudenta = imePrezimeStudenta;
        this.brojIndexa = brojIndexa;
        this.nazivPredmeta = nazivPredmeta;
        this.imePrezimeProfesora = imePrezimeProfesora;
        this.ocena = ocena;
    }

    public boolean ispitPolozen(){
        if (this.ocena>5) {return true;}
        return false;
    }

    public void print (){
        System.out.println(this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student: " + this.imePrezimeStudenta + ", broj indeksa " + this.brojIndexa);
        System.out.println("Profesor: " + this.imePrezimeProfesora);
    }

    public String getImePrezimeStudenta() {
        return this.imePrezimeStudenta;
    }

    public void setImePrezimeStudenta(String imePrezimeStudenta) {
        this.imePrezimeStudenta = imePrezimeStudenta;
    }

    public int getBrojIndexa() {
        return this.brojIndexa;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public String getNazivPredmeta() {
        return this.nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return this.ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImePrezimeProfesora() {
        return this.imePrezimeProfesora;
    }

    public void setImePrezimeProfesora(String imePrezimeProfesora) {
        this.imePrezimeProfesora = imePrezimeProfesora;
    }

}

package p14_09_2023.Zadatak2;

public class Reakcija {

    private String tip;
    private String imePrezimeKoJeReagovao;

    public Reakcija(String tip, String imePrezimeKoJeReagovao) {
        this.tip = tip;
        this.imePrezimeKoJeReagovao = imePrezimeKoJeReagovao;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setImePrezimeKoJeReagovao(String imePrezimeKoJeReagovao) {
        this.imePrezimeKoJeReagovao = imePrezimeKoJeReagovao;
    }

    public String getImePrezimeKoJeReagovao() {
        return imePrezimeKoJeReagovao;
    }
}

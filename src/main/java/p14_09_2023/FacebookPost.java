package p14_09_2023;

import java.util.ArrayList;

public class FacebookPost {

    public FacebookPost(String imePrezimeKoJePostovao, String objava) {
        this.imePrezimeKoJePostovao = imePrezimeKoJePostovao;
        this.objava = objava;
        this.reakcije = new ArrayList<>();
    }

    private String imePrezimeKoJePostovao;
    private String objava;
    private ArrayList<Reakcija> reakcije;

    public String getImePrezimeKoJePostovao() {
        return imePrezimeKoJePostovao;
    }

    public String getObjava() {
        return objava;
    }

    public void dodajReakciju(Reakcija novaReakcija) {
        for (int i = 0; i < reakcije.size(); i++) {
            if (this.reakcije.get(i).getImePrezimeKoJeReagovao().equals(novaReakcija.getImePrezimeKoJeReagovao())) {
                reakcije.remove(reakcije.get(i));
            }
        }
        this.reakcije.add(novaReakcija);
    }


    private int brojReakcija(String odredjeniTip) {
        int kolicina = 0;
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getTip().equals(odredjeniTip)) {
                kolicina = kolicina + 1;
            }
        }
        return kolicina;
    }

    public void print() {
        System.out.println(this.imePrezimeKoJePostovao);
        System.out.println(this.objava);
        System.out.println("Smajli " + this.brojReakcija("smile") + " | Like " + this.brojReakcija("like") + " | Srce " + brojReakcija("heart"));
    }
}

package p08_09_2023;

public class SlackMessage {

//Dopuniti klasu SlackMessage novim atributom koji kaze kada je poruka azurirana i kreirati metodu za azuriranje teksta.
//Metoda kao parametar prima novi tekst i datum kada je poruka azurirana. Metoda postavlja novi tekst i datum azuriranja u objektu.
//U glavnom programu pozvati ovu metodu za izmenu i nakon toga ponovo odstampati stanje objekata.


    String tekst;
    String imePrezime;
    String datumVreme;
    String azuriranoVreme;

    public void print() {
        System.out.println(this.imePrezime + " - " + this.datumVreme);
        System.out.println(this.tekst);
    }

    public void azuriraj(String azuriranTekst, String azuriranDatum) {
        this.azuriranoVreme = azuriranDatum;
        this.tekst = azuriranTekst;
    }
}

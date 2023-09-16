package p07_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

//Krairti klasu SlackMessage koja ima:
//tekst poruke
//ime i prezime osobe koja je stavila poruku
//datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//[ime i prezime osobe] - [kad je poslata]
//[Tekst poruke]

        SlackMessage a = new SlackMessage();
        a.tekst= "Djes ba!";
        a.datumVreme="15/09/2023 13:55";
        a.imePrezime= "Ana Laganin";

        SlackMessage b = new SlackMessage();
        b.imePrezime = "Milan Jovanovic";
        b.tekst = "Preljepo!";
        b.datumVreme = "07/09/2023 21:35";

        System.out.println(a.imePrezime + " - " + a.datumVreme);
        System.out.println(a.tekst);
        System.out.println(b.imePrezime + " - " + b.datumVreme);
        System.out.println(b.tekst);

    }
}

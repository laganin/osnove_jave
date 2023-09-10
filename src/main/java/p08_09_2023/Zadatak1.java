package p08_09_2023;

import p08_09_2023.SlackMessage;

public class Zadatak1 {
    public static void main(String[] args) {

       SlackMessage a = new SlackMessage();
        a.tekst= "Djes ba!";
        a.datumVreme="15/09/2023 13:55";
        a.imePrezime= "Ana Laganin";
        a.print();

        SlackMessage b = new SlackMessage();
        b.imePrezime = "Milan Jovanovic";
        b.tekst = "Preljepo!";
        b.datumVreme = "07/09/2023 21:35";
        b.print();

        a.azuriraj("Djes ba, djes ba!", "15/09/2023 14:00");
        b.azuriraj("Stvarno preljepo!", "08/09/2023 19:00");
        a.print();
        b.print();
    }
}

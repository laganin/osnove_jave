package p08_09_2023.Zadatak1;

public class Zadatak1 {

 //		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.
//Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
//
//Primer izvrsenja:
//Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//Primalac: Marko Markovic, 840-23932-334, stanje: 200
//Unesite sumu za transakciju: 500
//Stanje nakon stransakcije
//Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//Primalac: Marko Markovic, 840-23932-334, stanje: 700

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

package p19_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

//        Zadatak 2. Kreirati apstraktnu klasu Atleticar čiji su tributi:
//        ime i prezime privatni
//        i rezultat ostvaren na takmičenju koji je zasticen
//        Javne metode klase su:
//        apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//        metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)
//                Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trkača je bolji manji rezultat, a kod skakača veći.
//                Kreirati i klasu Disciplina čiji su privatni atributi:
//        ime discipline
//        tip discipline (Trkacka ili Skakacka)
//        niz atletičara koji učestvuju u toj disciplini.
//                U javnom delu klase definisati:
//        konstuktore, gettere i settere
//        konstruktor koji postavlja ime discipline i tip
//        metodu dodaj atleticara u disciplinu
//        metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
//        (za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom
//                (za vezbanje) metoda koja prikazuje podatke o pobedniku discipline.
//                U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa proizvoljnim brojem učesnika,
//        (za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline.


        Discipline jumping = new Discipline("Long jump", "jumping");
        Discipline running = new Discipline("110m hurdles", "running");

        Athlete one = new Runner("Milan Jovanovic", 10);
        Athlete two = new Jumper("Vladimir Minic", 6.55);
        Athlete three = new Runner("Marko Peric", 9);
        Athlete four = new Jumper("Tamara Sejic", 6);

        jumping.addAthlete(two);
        jumping.addAthlete(four);
        running.addAthlete(one);
        running.addAthlete(three);
        jumping.disqualify("Vladimir Minic");

        jumping.winner();
        running.winner();
    }
}

package p08_09_2023.Zadatak2;

public class Zadatak2 {

//Kreirati klasu Auto koja ima:
//ime i prezime vozaca
//marku automobila
//broj vrata
//potrosnju na 100km (npr: 3.6 litra)
//trenutnu brzinu kojom se auto krece
//metodu za stampu koja stampa podatke u formatu:
//[Vozac]
//	[Marka] - [br vrata]-ro vrata
//	Sa potrosnjom od [potrosnja] l na 100km
//	[Trenutna brzina auta] km/h je trenutna brzina.
//
//Primer:
//	Milan Jovanovic
//	BMW - 5-ro vrata
//	Sa potrosnjom od 10 l na 100km
//	200 km/h je trenutna brzina
//
//
//(Dopuna 1)
//U okviru klase Auto, implementirati jos 2 metode:
//metoda koja vraca informaciju da li je vozac prekoracio brzinu. Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca true ili false ako je trenutna brzina veca od ogranicenja.
//metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu prekoracenja placa se 1000din. Metoda od parametara prima ogranicenje brzine
//U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu informacija koje dobijete od njih.
//
//(Dopuna 2)
//Dopuniti klasu Auto tako da ima:
//atribut godinu proizvodnje
//atribut mesec do kad je registrovan auto (int)
//atribut kubikaza auta (npr: 1600 - 5000)
//metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
//metodu koja vraca da li je istekla registracije. Metoda kao parametar prima trenutni mesec i na osnovu toga vraca true ili false.
//metodu koja racuna i vraca cenu registracije za auto. Za automobile do 2000 kubika cena registracije kubikaza * 100din, za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.
//
//(Dopuna 3)
//Dopuniti klasu Auto tako da ima:
//atribut broj registracije
//atribut da li je ukljucena klima u autu
//metodu dodajGas, koja povecava trenutnu brzinu za 10.
//metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
//metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime
//
//	(Dopuna 4)
//	Dopuniti klasu Auto tako da ima:
//atribut za maksimalnu brzinu na auto (npr: 240)
//Promenite metodu dodajGas tako da povecanje brzine ne bude preko maksimalne brzine auta
//metodu stampajTablu koja stampa brzinomer sa table. Brzinomer uvek ima 100 jedinica za prikaz brzine.
//Ako je npr maksimalna brzina 240 i auto je u trenutnoj brzini 100, metoda stampa
//               |||||||||||||||||||||||||||||||||||||||||..................................................................... 100/240km/h
//(objasnjenje: ovde imamo 41 crticu koja oznacava brzinu 100km/h i imamo 59 tackica koje oznacavaju ostatak do maksimalne brzine)
//Broj crtica se racuna po formuli: (trenutna brzina * 100) / maksimalna brzina.

    public static void main(String[] args) {

        Auto auto = new Auto();

        auto.imePrezimeVozaca = "Milan Jovanovic";
        auto.marka = "BMW";
        auto.brojVrata = 5;
        auto.potrosnjaNa100km = 10;
        auto.trenutnaBrzina = 200;
        auto.maxBrzina = 240;
        auto.godinaProizvodnje = 2003;
        auto.mesecRegistracije = 7;
        auto.kubikaza = 1900;
        auto.stampaj();

        if (auto.prekoracio(100)) {
            System.out.println("Prekoracio je ogranicenje od 100.");
            System.out.println("Kazna je " + auto.kazna(100));
        } else {
            System.out.println("Nije prekoracio ogranicenje od 100.");
            System.out.println("Nema kazne");
        }

        System.out.println(auto.trenutnaPotrosnja());
        auto.stampajTablu();

        if (auto.oldtimer()) {
            System.out.println("Auto je oldtajmer.");
        } else System.out.println("Auto nije oldtajmer.");

        if (auto.isteklaRegistracija(9)) {
            System.out.println("Registracija je istekla.");
        } else System.out.println("Registracija nije istekla");

        System.out.println("Cena registracije je " + auto.cenaRegistracije());

        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();

        System.out.println(auto.trenutnaBrzina);

    }
}

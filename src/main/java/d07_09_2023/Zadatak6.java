package d07_09_2023;

public class Zadatak6 {
    public static void main(String[] args) {

//Upravljanje Flotom Vozila - Rešite Poslovni Problem
//
//Pretvorite se u softverskog arhitektu koji će rešiti konkretan poslovni problem. Radite za kompaniju za dostavu koja se suočava sa sve većim izazovima u upravljanju svojom flotom vozila.
//Vaš zadatak je da razvijete softver za efikasno praćenje i upravljanje resursima kompanije.
//
//Kompanija ima vozila, vozače, rute za dostavu i potrebu da prati status svake dostave. Vaš cilj je da identifikujete potrebne klase za rešavanje ovog problema.
//
//**Scenario:**
//
//Kompanija poseduje različite vrste vozila, svako vozilo ima svoje karakteristike, uključujući marku, model, registarski broj i godinu proizvodnje.
//Vozači su takođe deo flote i svaki vozač ima svoje lične informacije, uključujući ime, prezime, JMBG, broj vozačke dozvole i datum isteka vozačke dozvole.
//
//Dostave se odvijaju duž različitih ruta, a svaka ruta ima svoju polaznu tačku, odredište, dužinu rute (u kilometrima) i očekivano vreme putovanja.
//Vaš zadatak je da definišete potrebne klase za praćenje i upravljanje ovim resursima kako biste pomogli kompaniji da optimizuje svoje poslovanje.
//
//Kroz analizu ovog scenarija, razmislite koje klase su potrebne da biste efikasno rešili problem upravljanja vozilima, vozačima, rutama i dostavama.
//Kreirajte klase sa odgovarajućim atributima kako biste omogućili upravljanje ovim resursima i u glavnom programu kreirajte objekte.


        Vozila flota = new Vozila();
        Vozaci sofer = new Vozaci();
        Rute aerodrom = new Rute();
        Status check = new Status();

        flota.marka = "Mercedes";
        flota.model = "Benz";
        flota.godinaProizvodnje = 2020;
        flota.registarskiBroj = "XG007";

        sofer.imePrezime = "James Bond";
        sofer.JMBG = "007";
        sofer.brojVozačke = 007;
        sofer.istekVozacke = "nikad ne istice";

        aerodrom.polaznaTačku = "Hollywood";
        aerodrom.odredište = "LAX";
        aerodrom.dužinaKM = 99;
        aerodrom.travelTime = "3 sekunde";

        check.status = "On the way";


    }
}

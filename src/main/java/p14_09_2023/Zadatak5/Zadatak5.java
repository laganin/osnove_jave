package p14_09_2023.Zadatak5;

public class Zadatak5 {

//Za potrebe google istorije potrebno je kreirati sledece klase.
//Klasu HistoryPage koja ima:
//naziv stranice
//link do stranice
//vreme otvaranja stranice - sat i minut (2 atributa)
//username i password sacuvani za ovu stranicu (kao objasnjene ovo su kao kolacici za neki sajt)
//konstuktore koji su logicni
//gettere i setter (username i password nemaju settere)
//metodu sacuvaj kredencijale za ovu stranicu. Metoda kao parametre  prima username i password i setuje te atribute.
//Metoda obrisi kolacice koja setuje username i password na null.
//Metoda stampaj koja stampa podatke u formatu:
//[sat] - [minut] - [ naziv ]…[ link ] [Ako postoje kredencijali stampa se zvezdica pored linka]
//
//
//Klasu History koja ima:
//niz stranica koje su posecene
//metoda otvori stranicu koja dodaje novi historypage u niz.
//metodu obrisi prema linku - metoda koja iz niza izbacuje stranicu prema linku
//metoda obrisi kolacice za link - metoda koja za homepage brise kolacice
//metoda obrisi istoriju - metoda brise celu istoriju
//metoda sacuvajKredencija - od parametara se prima naziv stranice i username i password koji se cuvaju.
//metoda pogledajIstoriju - stampa sve posecene stranice
//metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.
//metoda obrisiSveKolaciceZaSadnjihSatVremena-  brise kolacice za strnaice koje su ucitane u zadnjih sat vremena. Metoda kao parametar prima trenutno vreme (sat i minut)


    public static void main(String[] args) {

        HistoryPage page = new HistoryPage("Google", "google.com", 8, 41);
        HistoryPage page1 = new HistoryPage("Yahoo", "yahoo.com", 5, 0);

        History history = new History();

        page.createCookies("username", "password");
        page1.createCookies("username", "password");
        page1.removeCookies();
        page.print();
        page1.print();

        history.openPage(page);
        history.openPage(page1);
        history.remove("google.com");
        history.removeHistory();
        history.openPage(page);
        history.openPage(page1);
        history.saveCredentials("Yahoo", "username", "password");
        history.removeCookiesForLink("yahoo.com");
        history.lastHourClearCookies(9, 0);
        history.checkHistory();

    }
}

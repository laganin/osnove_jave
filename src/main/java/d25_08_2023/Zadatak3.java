package d25_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {

//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

    podaci("0123456789", "Ana", "Laganin", "1989", true);

    }

    public static void podaci(String JMBG, String ime, String Prezime, String godinaRodjenja, boolean aktivan) {
        System.out.println("JMBG: " + JMBG);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + Prezime);
        System.out.println("God. rodjenja: " + godinaRodjenja);
        System.out.println("Aktivan: " + aktivan);
    }
}

package mini_projekat;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//**Zadatak: Generisanje Random Passworda sa Specijalnim karakterom**
//
//Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link: random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve i kako ih možete koristiti u različitim situacijama.
//
//Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
//generisikarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//generisiRandomSpecijalankarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
//
//Napomena: Metode generisiRandomSpecijalankarakter generisikarakter nemaju nikakvu stampu u sebi!
//
//Glavni program:
//   - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
//   - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
//
//Primer izvršenja 1:
//Unesite dužinu passworda: 10
//Da li želite da sadrži specijalan karakter: true
//Generisan password: eD9Kx0e@
//
//Primer izvršenja 2:
//Unesite dužinu passworda: 10
//Da li želite da sadrži specijalan karakter: false
//Generisan password: eCxdwEeFEx

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite dužinu passworda: ");
        int duzinaPassworda = s.nextInt();
        System.out.print("Da li želite da sadrži specijalan karakter (true/false): ");
        boolean specijalniKarakter = s.nextBoolean();
        for (int i = 0; i < duzinaPassworda; i++) {
            String randomKarakter = generisiRandomKarakter();
            String randomSpecijalniKarakter = generisiRandomSpecijalniKarakter();
            String password = randomKarakter;
            if (specijalniKarakter == true && i == duzinaPassworda - 1) {
                password = password.replace(randomKarakter, randomSpecijalniKarakter);
            }
            System.out.print("Generisan password: " + password);
        }
    }

    public static String generisiRandomKarakter() {
        ArrayList<String> karakter = new ArrayList<>();
        Random random = new Random();

        karakter.add("A");
        karakter.add("B");
        karakter.add("C");
        karakter.add("D");
        karakter.add("E");
        karakter.add("F");
        karakter.add("G");
        karakter.add("H");
        karakter.add("I");
        karakter.add("J");
        karakter.add("K");
        karakter.add("L");
        karakter.add("M");
        karakter.add("N");
        karakter.add("O");
        karakter.add("P");
        karakter.add("Q");
        karakter.add("R");
        karakter.add("S");
        karakter.add("T");
        karakter.add("U");
        karakter.add("V");
        karakter.add("W");
        karakter.add("X");
        karakter.add("Y");
        karakter.add("Z");
        karakter.add("a");
        karakter.add("b");
        karakter.add("c");
        karakter.add("d");
        karakter.add("e");
        karakter.add("f");
        karakter.add("g");
        karakter.add("h");
        karakter.add("i");
        karakter.add("j");
        karakter.add("k");
        karakter.add("l");
        karakter.add("m");
        karakter.add("n");
        karakter.add("o");
        karakter.add("p");
        karakter.add("q");
        karakter.add("r");
        karakter.add("s");
        karakter.add("t");
        karakter.add("u");
        karakter.add("v");
        karakter.add("w");
        karakter.add("x");
        karakter.add("y");
        karakter.add("z");
        karakter.add("0");
        karakter.add("1");
        karakter.add("2");
        karakter.add("3");
        karakter.add("4");
        karakter.add("5");
        karakter.add("6");
        karakter.add("7");
        karakter.add("8");
        karakter.add("9");

        int granicakarakterPozicije = karakter.size() - 1;
        int randomkarakterPozicija = random.nextInt(granicakarakterPozicije);
        String randomkarakter = karakter.get(randomkarakterPozicija);
        return randomkarakter;
    }

    public static String generisiRandomSpecijalniKarakter() {
        ArrayList<String> specijalniKarakter = new ArrayList<>();
        Random random = new Random();

        specijalniKarakter.add("@");
        specijalniKarakter.add("#");
        specijalniKarakter.add("&");
        specijalniKarakter.add("*");
        specijalniKarakter.add("!");

        int granicaSpecijalniKarakterPozicije = specijalniKarakter.size() - 1;
        int randomSpecijalniKarakterPozicija = random.nextInt(granicaSpecijalniKarakterPozicije);
        String randomSpecijalniKarakter = specijalniKarakter.get(randomSpecijalniKarakterPozicija);
        return (randomSpecijalniKarakter);
    }
}
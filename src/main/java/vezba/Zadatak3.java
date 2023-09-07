package vezba;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//Napisati program koji validira unos lozinke sve dok korisnik ne unese validnu.
//Lozinka je validna ukoliko ima minimum 8 karaktera i sadrzi bar jedan od dva
//specijalna karaktera a specijalni karakteri su @ i #
//Primer izvrsenja:
//Unesite lozinku: ITBootcamp
//Lozinka nije validna.
//Unesite lozinku: ITBootcamp12
//Lozinka nije validna.
//Unesite lozinku: ITBoo@
//Lozinka nije validna.
//Unesite lozinku: ITBootcamp@
//Lozinka je validna.

        Scanner s = new Scanner(System.in);
        boolean passwordValid = false;

        while (!passwordValid) {
            System.out.print("Unesite lozinku: ");
            String lozinka = s.next();
            if ((lozinka.contains("@") || lozinka.contains("#")) & lozinka.length() >= 8) {
                passwordValid = true;
                System.out.println("Lozinka je validna.");
            } else
            System.out.println("Lozinka nije validna.");
        }
    }
}
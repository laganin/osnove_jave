package p22_08_2023;

import java.util.Random;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//Zadatak
//Napisati program koji validira unos input polja za broj. Polje za unos prima samo brojeve u opsegu od 10 do 50.Korisnik unosi vrednosti dok ne unese validan  broj.
//Primer izvrsenja:
//Unesite broj: 5
//Greska: Broj nije u opsegu od 10 do 50.
//Unesite broj: -1
//Greska: Broj nije u opsegu od 10 do 50.
//Unesite broj: 51
//Greska: Broj nije u opsegu od 10 do 50.
//Unesite broj: 4
//KRAJ

        Scanner s = new Scanner(System.in);
        int broj = -1;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();
            if (broj < 10 || broj > 50) {
                System.out.println("Greska: Broj nije u opsegu od 10 do 50.");
            }
            if (broj >= 10 && broj <= 50) {
               isValid = true;
            }
        }
        System.out.println("KRAJ");
    }
}

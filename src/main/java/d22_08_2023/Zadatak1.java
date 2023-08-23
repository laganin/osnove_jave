package d22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
//Unesite vrednost: 20
//Unesite vrednost: 50
//Unesite vrednost: 50
//Prekoracenje! Kraj programa. Sracunata suma je 70.

        Scanner s = new Scanner(System.in);
        boolean prekoracenje = false;
        int cap = 100;
        int suma = 0;

        while (!prekoracenje) {
            System.out.print("Unesite vrednost:");
            int vrednost = s.nextInt();
            suma = suma + vrednost;
            if (suma > cap) {
                prekoracenje = true;
                System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + (suma-vrednost) + ".");
            }

        }


    }
}

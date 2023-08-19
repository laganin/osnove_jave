package d18_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

//(Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
//Primer izvrsenja:
//Unesite dimenziju table: 5
// _|_|_|_|_|
// _|_|_|_|_|
// _|_|_|_|_|
// _|_|_|_|_|
// _|_|_|_|_|
//
//Primver izvrsenja 2:
//Unesite dimenziju table: 7
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite dimanziju tabele: ");
        int x = s.nextInt();

        int table = x * x;

        for (int i = 1; i <=table; i++) {
               if (i%x!=0)
               {System.out.print("_|");}
                else if (i % x == 0)
                {System.out.println("_|");}

            }
        }
}

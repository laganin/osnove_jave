package p18_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//Napisati program koji ucitava broj a i ispisuje poruke:
//Ukoliko je broj a do 10 stampamo da je jednocifren broj
//Ukoliko je broj a do 100 stampamo da je dvocifren broj
//Ukoliko je broj a veci od 100 stampamo da je trocifren.


        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj a: ");
        int a = s.nextInt();

        if (a >= 0 && a < 10) {
            System.out.println("Jednocifren broj.");
        } else if (a < 100) {
            System.out.println("Dvocifren broj.");
        } else if (a < 1000) {
            System.out.println("Trocifren broj.");
        }
    }
}

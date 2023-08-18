package p18_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//Napisati program koji ispisuje za uneti broj a da li je deljiv sa 2 ili sa 3.Ispisati poruke na kraju programa u obe situacije.
//Upoznajte se sa opertorom moduo % dok ne dodjemo do tog operatora.
//HINT: Broj B je deljiv brojem A ukoliko je ostatak pri deljenju sa A jedan nuli.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj a: ");
        int a = s.nextInt();

        if (a % 2 == 0) {
            System.out.println("2");

        }

        if (a % 3 == 0) {
            System.out.println("3");

        }
    }
}

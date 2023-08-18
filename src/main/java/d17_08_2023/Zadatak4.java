package d17_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu. Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.
//
//T1 i T2 su pozicije login forme. M je pozicija na koju je kliknuto
//
//Primer izvrsenja 1:
//Unesite x za T1: 10
//Unesite y za T1: 100
//Unesite x za T2: 100
//Unesite y za T2: 0
//Unestie x za M: 50
//Unesite y za M: 50
//Kliknuto je unutar forme
//
//Primer izvrsenja 2:
//Unesite x za T1: 10
//Unesite y za T1: 100
//Unesite x za T2: 100
//Unesite y za T2: 0
//Unestie x za M: 120
//Unesite y za M: 50
//Nije kliknuto je unutar forme

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite x za T1: ");
        int xT1 = s.nextInt();

        System.out.print("Unesite y za T1: ");
        int yT1 = s.nextInt();

        System.out.print("Unesite x za T2: ");
        int xT2 = s.nextInt();

        System.out.print("Unesite y za T2: ");
        int yT2 = s.nextInt();

        System.out.print("Unesite x za M: ");
        int xM = s.nextInt();

        System.out.print("Unesite y za M: ");
        int yM = s.nextInt();

        if(xM < xT1 || xM < xT2) {

        if(yM < yT1 || yM < yT2) {

                    System.out.println("Sve ok!");}

    } else System.out.println("Nije kliknuto unutar forme ");

    }
}

package p21_08_2023;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {

//Napisati program koji sakriva uneti password..
//Primer izvrsenja:
//Unestite password: OvoJePassword123
//Skriverni password: ****************

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite password: ");
        String password = s.next();

        int skriveni = password.length();

        System.out.print("Skriveni password je: ");

        for (int i = 0; i < skriveni; i++) {
            System.out.print("*");
        }

    }
}
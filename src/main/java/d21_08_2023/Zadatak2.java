package d21_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 32
//Unesite broj: 121
//Unesite broj: 1333
//Unesite broj: 144
//Suma je: 265

        Scanner s = new Scanner(System.in);
        int suma = 0;

        System.out.print("Unesite N: ");
        int N = s.nextInt();

        for (int i = 1; i <=N; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            if (99<broj && broj<1000){
                suma = suma + broj;}
        }

        System.out.println(suma);


    }
}

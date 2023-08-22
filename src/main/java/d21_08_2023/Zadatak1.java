package d21_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve. Na kraju programa prikazati sumu.
//Primer izvrsenja:
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 2
//Unesite broj: 9
//Unesite broj: 6
//Unesite broj: 8
//Suma parnih brojeva je 16
//Objasnjenje: 2 + 6 + 8 = 16

        Scanner s = new Scanner(System.in);
        int suma = 0;

        System.out.print("Unesite N: ");
        int N = s.nextInt();

        for (int i = 1; i <=N; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            if (broj%2==0){
            suma = suma + broj;}
        }

        System.out.println(suma);
    }
}

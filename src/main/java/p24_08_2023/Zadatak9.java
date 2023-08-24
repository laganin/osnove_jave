package p24_08_2023;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

//Napisati program koji ucitava N brojeva koje smesta u niz i NA KRAJU programa ih stampa. Potrebne su dve petlje, u jednoj se desava ucitavanje niza a u drugoj stampanje.
//Primer:
//Unesite N: 10
//Unesite broj: 1
//Unesite broj: 2
//Unesite broj: 3
//Unesite broj: 4
//Unesite broj: 8
//Unesite broj: 9
//Unesite broj: 2
//Unesite broj: 1
//Unesite broj: 7
//Unesite broj: 5
//Niz je:
//1, 2, 3, 4, 8, 9, 2, 1, 7, 5


        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            numbers.add(broj);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + ", ");
        }

    }

}


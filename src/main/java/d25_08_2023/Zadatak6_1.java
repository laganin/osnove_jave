package d25_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak6_1 {
    public static void main(String[] args) {
        //Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj M: ");
        int M = s.nextInt();
        System.out.print("Unesite broj N: ");
        int N = s.nextInt();
        int izbroj = rezultat(M, N);
        printIzbroj(M, N, izbroj);
    }

    public static int rezultat(int M, int N) {
        ArrayList<Integer> brojevi = new ArrayList<>();
        for (int i = M; i < N; i++) {
            brojevi.add(i);
        }
        return brojevi.size() - 1;
    }

    public static void printIzbroj(int a, int b, int c) {
        System.out.println("izbroji (" + a + ", " + b + ") ima za rezultat " + c);

    }
}

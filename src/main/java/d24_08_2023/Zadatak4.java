package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
//Primer izvrsenja:
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: -4
//Unesite broj: 3
//Unesite broj: -7
//Unesite broj: 9
//
//Brojevi veci od nule u nizu A su: 1, 3, 9,

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> niz = new ArrayList<>();

        System.out.print("Unesite N: ");
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            if (broj > 0) {
                niz.add(broj);
            }
        }
        System.out.print("Brojevi veci od nule u nizu A su: ");

        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + ", ");
        }

    }
}


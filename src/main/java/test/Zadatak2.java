package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> udaljenost = new ArrayList<>();

        double infrastruktura = 0;

        System.out.print("Unesite N: ");
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Unesite rastojanje: ");
            int rastojanje = s.nextInt();
            udaljenost.add(rastojanje);
        }

        for (int i = 0; i < N; i++) {
            System.out.print("|..." + udaljenost.get(i) + "m...");
        }
        System.out.println("|");

        int standard = 0;
        for (int i = 0; i < N; i++) {
            if (udaljenost.get(i)<50 || udaljenost.get(i)>100){
                System.out.println("Rastojanje na poziciji " + i +", duzine " + udaljenost.get(i) + "m nije po standardima Evropske unije.");
            }
        }

        for (int i = 0; i < N; i++) {
            double dvaDalekovoda = udaljenost.get(i) * 1.5;
            infrastruktura = dvaDalekovoda + infrastruktura;
        }
        System.out.println("Potrebna dužina kablova za dalekovodnu infrastrukturu je " + infrastruktura + "m.");

    }
}

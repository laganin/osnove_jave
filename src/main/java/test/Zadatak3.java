package test;

import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        boolean pogodiliste = false;
        int tajniBroj = random.nextInt(51);
        int brojPokusaja=0;

        while (!pogodiliste) {
            brojPokusaja++;
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if (brojPokusaja==5){
                pogodiliste = true;
                System.out.println("Kraj igre! Niste pogodili tajni broj u 5 pokušaja.");}
            else if (tajniBroj > broj) {
                System.out.println("Tajni broj je veci");
            } else if (tajniBroj<broj) {
                System.out.println("Tajni broj je manji");
            }
            if (tajniBroj == broj) {
                pogodiliste = true;
                System.out.println("Čestitamo, pogodili ste tajni broj!");
            }
        }
    }
}
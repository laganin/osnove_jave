package d25_08_2023;

import java.sql.SQLOutput;

public class Zadatak7 {
    public static void main(String[] args) {

//Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
//
//Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
//Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4

        int najmanjiBroj = najmanjiIzNiz(4, 6, 1);
        printNajmanjiBroj(najmanjiBroj);
    }

    public static int najmanjiIzNiz(int a, int b, int c) {
        if (a < b && a < c) return a;
        else if (b < a && b < c) return b;
        else if (c < a && c < b) return c;
        return 0;
    }

    public static void printNajmanjiBroj(int a) {
        System.out.println("Najmanji broj u nizu je " + a);
    }
}

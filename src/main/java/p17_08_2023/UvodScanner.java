package p17_08_2023;

import java.util.Scanner;

public class UvodScanner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj a: ");
        int a = s.nextInt();

        System.out.println("Unesite broj b: ");
        int b = s.nextInt();

        int zbir = 0, razlika = 0, proizvod = 0, kolicnik = 0;

        zbir = a + b;
        razlika = a - b;
        proizvod = a * b;
        kolicnik = a / b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("Zbir je " + zbir);
        System.out.println("Razlika je " + razlika);
        System.out.println("Proizvod je " + proizvod);
        System.out.println("Kolicnik je " + kolicnik);


    }
}

package vezba;

import java.util.Scanner;

public class Zadatak1_1 {
    public static void main(String[] args) {

//Napisati program koji za unetu visinu i težinu osobe računa indeks telesne
//mase (BMI) i na osnovu tog rezultata osobu raspoređuje u jednu od četiri kategorije.
//BMI se računa po formuli
//𝐵𝑀𝐼 =
//𝑡𝑒𝑧𝑖𝑛𝑎 𝑢 𝑘𝑔
//(𝑣𝑖𝑠𝑖𝑛𝑎 𝑢 𝑚)
//2
//dok se kategorija određuje prema tabeli 1.1.
//Tabela 1.1 Određivanje kategorije na osnovu indeksa telesne mase
//Primer izvrsenja: Unesite tezinu osobe (kg): 110
//Unesite visinu osobe (m): 1.9
//Kategorija je Gojaznost

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite tezinu osobe (kg): ");
        double tezina = s.nextDouble();
        System.out.print("Unesite visinu osobe (m): ");
        double visina = s.nextDouble();
        double BMI = tezina / (visina * visina);

        if (BMI < 18.5) {
            System.out.print("Kategorija je Neuhranjenost");
        } else if (BMI < 25) {
            System.out.print("Kategorija je Normalna tezina");
        } else if (BMI < 30) {
            System.out.print("Kategorija je Prekomerna tezina");
        } else if (BMI >= 30) {
            System.out.print("Kategorija je Gojaznost");
        }
    }
}

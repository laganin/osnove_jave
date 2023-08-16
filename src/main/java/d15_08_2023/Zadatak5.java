package d15_08_2023;

public class Zadatak5 {
    public static void main(String[] args) {

//Napisati program koji racuna i ispisuje povrsinu i obim trougla. KOREN BROJA 3 neka bude konstanta 1.73. Za stranicu trougla postavite proizvoljnu vrednost.
//Primer izvrsenja programa:
//a: 10
//Povrsina je 43.25
//Obim je 30

int stranicaTrougla = 3;
double KORENBROJA3 = 1.73;

double povrsinaTrougla = ((stranicaTrougla * stranicaTrougla) * KORENBROJA3)/4;
double obimTrougla = 3*stranicaTrougla;

        System.out.println("a: " + stranicaTrougla);
        System.out.println("Povrsina je " + povrsinaTrougla);
        System.out.println("Obim je " + obimTrougla);

    }
}

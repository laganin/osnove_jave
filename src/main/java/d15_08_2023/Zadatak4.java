package d15_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {

//Napisati proram koji ima promenljivu a za koju ispisuje tablicu mnozenja.
//Napomena: Rezultati tablice mnozenja se racunaju.
//Primer izvrsenja, ako je a = 5 ispisace se
//5 x 1 = 5
//5 x 2 = 10
//5 x 3 = 15
//5 x 4 = 20
//5 x 5 = 25
//5 x 6 = 30
//5 x 7 = 35
//5 x 8 = 40
//5 x 9 = 45
//5 x 10 = 50

        int a = 5;

        int saJedan = 1 * a;
        int saDva = 2 * a;
        int saTri = 3 * a;
        int saCetiri = 4 * a;
        int saPet = 5 * a;
        int saSest = 6 * a;
        int saSedam = 7 * a;
        int saOsam = 8 * a;
        int saDevet = 9 * a;
        int saDeset = 10 * a;

        System.out.println(a + " x 1 = " + saJedan );
        System.out.println(a + " x 2 = " + saDva );
        System.out.println(a + " x 3 = " + saTri );
        System.out.println(a + " x 4 = " + saCetiri );
        System.out.println(a + " x 5 = " + saPet );
        System.out.println(a + " x 6 = " + saSest );
        System.out.println(a + " x 7 = " + saSedam );
        System.out.println(a + " x 8 = " + saOsam );
        System.out.println(a + " x 9 = " + saDevet );
        System.out.println(a + " x 10 = " + saDeset );

    }
}

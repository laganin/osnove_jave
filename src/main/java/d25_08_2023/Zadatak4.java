package d25_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {

//        Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//         / / / / /
//        Napomena: Metoda nista ne vraca.

            printCharacters(5,"/");
    }

    public static void printCharacters (int N, String character) {
        for (int i = 0; i < N; i++) {
            System.out.print(character);
        }


    }
}

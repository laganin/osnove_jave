package d15_08_2023;

public class Zadatak9 {
    public static void main(String[] args) {

//Napisati program koji vrsi procentualnu procenu u fazi skidanja fajla. Program od informacija cuva naziv originalnog fajla, velicinu originalnog fajla u Mb (megabajtima) i velicinu skunutog dela fajla takodje u Mb. Na kraju programa racuna i ispisuje koji je deo fajla skinut.Stampanje se vrsi u formatu
//naziv fajla velicina originalnog fajla Mb/velicina skinutog dela fajla Mb
//*****************************
//***********procenat %
//*****************************
//Primer izvrsenja:
//profile-image.png 7Mb/2Mb
//*****************************
//*********** 28%
//*****************************

        String nazivOGFajla = "ime_fajla.txt";
        int velicinaOGFajla = 23;
        int velicinaDWNLDFajla = 16;
        int procenat = (velicinaDWNLDFajla * 100) / velicinaOGFajla;

        System.out.println( nazivOGFajla + " "+ velicinaOGFajla + " Mb/" + velicinaDWNLDFajla + " Mb");
        System.out.println("*****************************");
        System.out.println("***********" + procenat + " %");
        System.out.println("*****************************");




    }
}

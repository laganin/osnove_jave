package d15_08_2023;

public class Zadatak12 {
    public static void main(String[] args) {

//Napisati program za promenu velicine slike na osnovu cuvanih podataka. Program cuva sledece informacije:
//Naziv slike
//Rezoluciju (duzina i visina)
//Faktor skaliranja
//Na osnovu faktora skaliranja, program će odluciti hoce li sliku smanjiti ili povecati.
//Evo teorijskih primera za faktor skaliranja:
//ako je originalna slika 1920x1080, a faktor skaliranja 0.8, slika ce se smanjiti za 20% i rezolucija ce postati 1536x864.
//S druge strane, ako je faktor skaliranja 1.3, slika ce se povecati za 30% i rezolucija ce postati 2496x1404.
//Na kraju programa, prikazati velicinu svake slike u megabajtima (MB). Naziv nove slike se dobija dodavanjem prefiksa "resized-" originalnom nazivu.
//Primer izvrsenja:
//Original image: profile-image.png  Size: 1.977Mb
//Scale: 1.3
//Resized image: resized-profile-image.png Size: 3.342Mb
//| Click here to Download image |

        String nazivSlike = "moj_fotka.jpg";
        int duzinaRezolucija = 1848;
        int visinaRezolucija = 4000;
        double faktorSkaliranja = 0.8;

        int brojOGPiksela = duzinaRezolucija * visinaRezolucija;
        int velicinaOGSlike = brojOGPiksela;
        double velicinaOGSlikeMb = velicinaOGSlike * 0.000001;

        int faktorDuzina = (int)(duzinaRezolucija * faktorSkaliranja);
        int faktorVisina = (int)(visinaRezolucija * faktorSkaliranja);

        int brojRSPiksela = faktorVisina * faktorDuzina;
        int velicinaRSSlike = brojRSPiksela;
        double velicinaRSSlikeMb = velicinaRSSlike * 0.000001;


        System.out.print("Original image: " + nazivSlike);
        System.out.println(" Size in (Mb): " + velicinaOGSlikeMb);
        System.out.println("Scale: " + faktorSkaliranja);
        System.out.print("Risized image: resized-" + nazivSlike);
        System.out.println(" Size in (Mb): " + velicinaRSSlikeMb);




    }
}

package d15_08_2023;

public class Zadatak13 {
    public static void main(String[] args) {

//Napisati program koji simulira ponasanje auto video quality funkcionalnost na youtube-u.
//Program od informacija ima:
//naziv videa
//duzinu fajla u sekundama (npr: ako video traje 2:29, cuva se 149s)
//broj frame-ova  po sekundi
//rezoluciju (duzina x visina frame-a)
//Teorija: Frame je jedna slika u videu date rezolucije. video se sastoji od niza frame-ova i obicno se po sekundi prikaze od 20 do 30 frame-a, zavisno od samog videa.
// Npr: ako imate video koji traje 5s rezolucije 1920x1080 sa 10 frame-a po sekundi, to znaci da se u jednoj sekundi prikazu 10frama sto ce biti na po 100 milisekundi jedna slika.
//Program racuna minimalan internet protok po sekundi potreban za datu rezoluciju. Minimalan internet protok je protok koji moze da ucita sekundu videa u sekundi.
// Minimalni protok treba da bude izrazen u Mb/s
//Dodatno program isposuje informacije u odredjenom formatu. Napomena: Informacija za duzinu videa treba da bude u formatu minuti:sekunde
//Primer izvrsenja:
//*************************************************************************
//Tea Tairović - Bibi Habibi (Official Video | Album Balerina)
//2:29   <| | | | |
//Number of frames per second: 20
//Resolution: 1920x1080
//Minimal network speed: 39Mb/s

        String nazivVidea = "Sekunde nisu ispod 10 - Milan Jovanovic";

        double CD = 0.000001;
        double osamCdVidea = CD * 1;
        double sestnaestcDVidea = CD * 2;
        double dvadesetCetiricDVidea = CD * 3;

        int duzinaFajla = 225;
        int minuti = duzinaFajla / 60;
        int sekundi = duzinaFajla - minuti * 60;

        int brojFrejmova = 24;

        int duzinaFrejma = 1920;
        int visinaFrejma = 1080;
        int rezolucija = duzinaFrejma * visinaFrejma;
        int minInternetSpeed = (int)(rezolucija * brojFrejmova * dvadesetCetiricDVidea);


        System.out.println(nazivVidea);
        System.out.println(minuti + ":" + sekundi + "    <| | | | |");
        System.out.println("Number of frames per second: " + brojFrejmova);
        System.out.println("Resolution: " + duzinaFrejma+ "x" +visinaFrejma);
        System.out.println("Minimal network speed: " + minInternetSpeed + "Mb/s");



    }
}

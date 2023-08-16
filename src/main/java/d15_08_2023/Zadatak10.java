package d15_08_2023;

public class Zadatak10 {
    public static void main(String[] args) {

//Napisati program koji vrsi grubu procenu koliko je vremena potrebno da se skine fajl. Program od informacija cuva naziv fajla, velicinu fajla i brzinu skidanja.
//Velicina fajla je u Mb a brzina skidana u Mb/s (megabajt u sekundi)
//Primer izvrsenja
//File: profile-image.log
//Size: 25Mb
//Download speed: 3Mb/s
//Estimated time: 8s


     String nazivFajla = "gruba_procena.mp3";
     double velicinaFajla = 400;
     double brzinaSkidanja= 640;
     double downloadTime = velicinaFajla / brzinaSkidanja;

        System.out.println("File: " + nazivFajla);
        System.out.println("Size " + velicinaFajla + "Mb");
        System.out.println("Download speed: " + brzinaSkidanja + "Mb/s");
        System.out.println("Estimated time: " + downloadTime + "s");



    }
}

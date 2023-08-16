package d15_08_2023;

public class Zadatak2 {

    public static void main(String[] args) {

//Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici.
//Od informacija se pamti broj kartice (16 cifara sa razmacima), mesec i godina do kada vazi kartica, kao i ime i prezime vlasnika kartice.
//Kartica se stampa sa zvezdicama i ne brinite ukoliko neka zvezdica mrdne i nije u liniji to ce zavisiti od duzine imena.
//Napomena: svaka informacija mora da bude u okviru posebne promenljive.

String brojKartice = "1234 1232 4321 1212", validDate = "10/25", imePrezime = "Vlada Minic";

        System.out.println("*********************************************");
        System.out.println("*  Credit Card                              *");
        System.out.println("*     ****                                  *");
        System.out.println("*     ****                                  *");
        System.out.println("*       " + brojKartice + "                 *");
        System.out.println("*                  valid > " + validDate + "            *");
        System.out.println("*                                           *");
        System.out.println("*  " + imePrezime + "                              *");
        System.out.print("*********************************************");
    }



}

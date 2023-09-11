package d08_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {

//Kreirati klasu SmartAirConditioning koja ima:
//atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//atribut za mod (hladi/greje)
//metodu za stampu - stampa u formatu
//marka - mod - termperatura
//metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//metodu koja racuna koliko klima novca potrosi za mesec dana
//Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//Metoda vraca ukupnu cenu za taj mesec
//
//U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.


        SmartAirConditioning klima = new SmartAirConditioning();

        klima.brand = "Elite";
        klima.coolPower = 1;
        klima.heatPower = 2;
        klima.temperature = 16;
        klima.mode = "cool";

        klima.print();
        System.out.println();
        System.out.println("Mesecna potrosnja je " + klima.potrosnja());
        System.out.println("Mesecni racun je " + klima.monthlyBill());


    }
}
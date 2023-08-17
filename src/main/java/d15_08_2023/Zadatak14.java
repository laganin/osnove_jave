package d15_08_2023;

public class Zadatak14 {
    public static void main(String[] args) {

//Napisati program koji vrsi grubu procenu koliko je vremena potrebno da se baterija na telefonu napuni do 100%. Program od informacija cuva:
//Naziv telefona
//Kapacitet baterije u mAh (miliamper sat)
//Trenutna napunjenost baterije u % (procentima)
//Struja punjenja u mA (miliamper)
//Teorijski: Struja punjenja nam kaze koliko se miliampera napuni za 1h punjenja.
//Primer izvrsenja:
//Iphone 11 pro max
//Kapacitet baterije: 3000mAh
//Baterija trenutno na 20%
//Struja punjenja 1000mA
//Procenjeno vreme punjenja je 2.4h.

        String phoneName = "Samsung S22+";
        int batteryCapacity = 4370, batteryStatus = 17, power = 1550;
        double time = batteryCapacity/power * (double)(100-batteryStatus)/100;

        System.out.println(phoneName);
        System.out.println("Kapacitet baterije: " + batteryCapacity + "mAh");
        System.out.println("Baterija trenutno na " + batteryStatus + "%");
        System.out.println("Struja punjenja " + power + "mA");
        System.out.println("Procenjeno vremen punjenja je " + time + "h");

    }
}

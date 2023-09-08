package d07_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Student a = new Student();
        Student b = new Student();

        a.ime = "Ana Laganin";
        a.brojIndeksa = 5808;
        a.fakultet = "Filozofski fakultet";

        b.ime = "Luka i Kuzma";
        b.brojIndeksa = 1;
        b.fakultet = "Zivotni";

        System.out.println(a.ime + ", " + a.fakultet + ", " + a.brojIndeksa);
        System.out.println(b.ime + ", " + b.fakultet + ", " + b.brojIndeksa);

    }
}

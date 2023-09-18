package d07_09_2023.Zadatak1;

public class Zadatak1 {

// Kreiranje klase "Student"
//Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i fakultet (String). Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti. Ispisati informacije o studentima.

    public static void main(String[] args) {

        Student a = new Student();
        Student b = new Student();

        a.fullName = "Ana Laganin";
        a.indexNumber = 5808;
        a.faculty = "Faculty of Philosophy";

        b.fullName = "Milan Jovanovic";
        b.indexNumber = 1;
        b.faculty = "Faculty of Law";

        System.out.println(a.fullName + ", " + a.faculty + ", " + a.indexNumber);
        System.out.println(b.fullName + ", " + b.faculty + ", " + b.indexNumber);

    }
}

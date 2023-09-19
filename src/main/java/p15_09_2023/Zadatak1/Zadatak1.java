package p15_09_2023.Zadatak1;

public class Zadatak1 {
//    Kreirati klasu Osoba koja od atributa ima:
//    ime i prezime
//            jmbg
//    konstuktor sa parametrima
//    difoltni konstuktor
//    metodu stampaj koja stampa podatke u formatu
//    ime prezime, jmbg
//
//
//    Kreirati klasu Student koja nasledjuje klasu Osoba,
//    koja od dodatnih atributa ima:
//    broj indeksa
//    dug za skolarinu
//    konstuktor sa parametrima
//    difoltni konstuktor
//    metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//    Napisati metod stampajStudenta da stampa sve podatke o studentu
//
//
//    Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//    koja od dodatnih atributa ima:
//    naziv predmeta koji predaje
//    iznos plate
//    konstuktor sa parametrima
//    difoltni konstuktor
//    metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//    Napisati metodu stampajProfu da stampa sve podatke o profesoru
//
//
//    U glavnom programu kreirati 2 studenta i 2 profesora.
//
//            Prilagodite konstuktore
//    Overide-tujte metodu za stampu iz osnovne klase


    public static void main(String[] args) {

        Professor professor1 = new Professor("Vladimir Minic", "001236554789", "Matematika", 50000);
        professor1.salaryRaise(50);
        professor1.print();
        System.out.println();


        Professor professor2= new Professor("Milos Dabetic", "06506562653523", "Istorija", 20000);
        professor2.print();
        System.out.println();

        Student student1  = new Student("Milan Jovanovic", "0123654789", "58", 100);
        student1.payScholarship(50);
        student1.print();
        System.out.println();

        Student student2 = new Student("Marko Peric", "9876543210", "38", 1000);
        student2.payScholarship(900);
        student2.print();





    }
}

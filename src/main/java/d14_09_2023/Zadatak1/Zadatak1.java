package d14_09_2023.Zadatak1;

public class Zadatak1 {

//Napisati klasu Student koja ima
//
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
//
//
//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)

    public static void main(String[] args) {

        Student a = new Student("IT1", "Milan Jovanovic", "IT");
        Student b = new Student("HP1", "Vladimir Minic", "Hospitality");

        Exam one = new Exam("Life", 5, "Jovana Jovanovic");
        Exam two = new Exam("Hotels", 10, "Milica Radovanovic");
        Exam three = new Exam("Management", 6, "Lazar Lazarevic");
        Exam four = new Exam("Management", 8, "Dijana Cejic");


        a.addExam(one);
        a.addExam(three);
        a.averageGrade();
        a.print();
        System.out.println();
        b.addExam(two);
        b.addExam(four);
        b.averageGrade();
        b.print();
    }
}

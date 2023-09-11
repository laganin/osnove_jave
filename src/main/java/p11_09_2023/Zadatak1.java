package p11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

//Kreirati klasu Student koja ima:
//ime
//prezime
//broj indeksa (int)
//da li je na budzetu
//gettere i settere za sve atributge

        Student test = new Student();

        test.setIme("Milan");
        test.setPrezime("Jovanovic");
        test.setBrojIndeksa(58);
        test.setBudget(true);

        test.print();

    }
}

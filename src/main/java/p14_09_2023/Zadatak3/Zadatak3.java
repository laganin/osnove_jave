package p14_09_2023.Zadatak3;

public class Zadatak3 {

//Kreirati klasu TestStep koja od privatnih atributa ima:
//opis
//actual vrednost
//expected vrednost
//errorMessage
//konstuktor koji postavlja sve atribute
//getere za sve elemente
//settere nemamo
//metodu validate koja proverava da li su actual i expected vrednosti jednake i ukoliko jesu metoda vraca true u suprotnom vraca false
//metodu za stampu koja stampa test step u formatu:
//|  Opis |
//| Status(failed ili passed) | Error message (ako je test step failovao)
//
//	Kreirati klasu TestCase koja od privatnih atributra ima:
//ID
//naziv
//niz test koraka
//metodu addTestStep koja dodaje test step u niz
//metodu koja vraca broj test stepova koji su failovali (oni kod kojih actual vrednost nije jednaka sa expected)
//metodu koja vraca stanje testcase-a. Ukoliko nema koraka koji su failovali metoda vraca “PASSED” u suprotnom “FAILED”
//metoda koja stampa status test case-a u formatu
//ID - Naziv
//|  Opis  |
//|  Status(failed ili passed) | Error message (ako je test step failovao)
//|  Opis  |
//|  Status(failed ili passed) | Error message (ako je test step failovao)
//|  Opis  |
//|  Status(failed ili passed) | Error message (ako je test step failovao)
//ukupan broj koraka / broj test stepova koji su faulovali
//Stanje test case-a (PASSED ILI FALED)
//
//
//PRIMER TEST CASE-a (Objasnjenja idu u zagradama):
//ID - Validate Login Form
//| Open app |
//| passed | (actual=””, expected=””)
//| Check if login link is visible |
//| passed |  (actual=”visible”, expected=”visible”)
//| Click on login link |
//| passed | (actual=””, expected=””)
//| Click on login link |
//| passed | (actual=””, expected=””)
//| Check if form is visible |
//| passed | (actual=”visible”, expected=”visible”)
//| Enter username |
//| passed |  (actual=””, expected=””)
//| Enter password |
//| passed |  (actual=””, expected=””)
//| Check if login button is visible |
//| failed | Login button is not visible  (actual=”visible”, expected=”invisible”)
//| Click on login button |
//| passed |  (actual=””, expected=””)
//| User should be logged |
//| failed | User is not logged|  (actual=”logged”, expected=”not logged”)
//| Page should be /home |
//| failed | User should be redirected to home page (actual=”/login”, expected=”/home”)
//11 / 3
//TEST CASE FAILED


    public static void main(String[] args) {

        TestStep prvi = new TestStep("prvi opis", "ne znam", "mozda", "error message");
        TestStep drugi = new TestStep("drugi opis", "ne moze", "ne moze", "");
        TestStep treci = new TestStep("treci opis", "znam", "mozda", "error message");
        TestStep cetvrti = new TestStep("cetvrti opis", "znam", "znam", "");
        TestStep peti = new TestStep("peti opis", "ne znam", "verovatno", "error message");
        TestCase test = new TestCase(007, "QA");

        test.dodajStep(prvi);
        test.dodajStep(drugi);
        test.dodajStep(treci);
        test.dodajStep(cetvrti);
        test.dodajStep(peti);

        test.print();

    }
}

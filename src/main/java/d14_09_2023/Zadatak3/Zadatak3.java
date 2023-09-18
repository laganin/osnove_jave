package d14_09_2023.Zadatak3;

public class Zadatak3 {

//    Kreirati klasu TableHeader koja ima:
//    niz celija u headeru tabele. Niz je niz stringova
//    metodu addHeaderCell, koja dodaje polje u niz
//    metodu za stampu koja stampa celije kao u primeru:
//    celija1\t\t|\t\tcelija2\t\t|\t\tcelija3\t\t|    (itd)
//            (Objasnjenje \t je specijalan karakter tab koji ce da sluzi da lakse poravnate kolone)
//    metodu printHTML, koja sluzi da stampa header u HTML formatu.
//    header se stampa izmedju <tr></tr>, a svaka celija mora da se nelazi u <th></th>
//    primer:
//<tr><th>First Name</th><th>Last Name</th><th>Age</th></tr>
//
//
//
//    Kreirati klasu TableRow koja ima:
//    niz celija u telu tabele. Niz je niz stringova
//    metodu addRowCell, koja dodaje polje u niz
//    metodu za stampu koja stampa celije kao u primeru:
//    celija1\t\t|\t\tcelija2\t\t|\t\tcelija3\t\t|    (itd)
//    metodu printHTML, koja sluzi da stampa red u HTML formatu.
//    red se stampa izmedju <tr></tr>, a svaka celija mora da se nelazi u <td></td>
//    primer:
//<tr><td>Milan</td><td>Jovanovic</td><td>27</td></td>
//
//
//    Kreirati klasu Table koja ima:
//    header tabele
//    niz redova. Niz je niz TableRow elementa
//    setter za header
//    metodu za dodvanje novog reda u tablu
//    metodu za stampu koja stampa header i redove tabele
//    metodu za stampu HTML-a tabele.Primer
//            <table>
//<thead>
//<tr><th>First Name</th><th>Last Name</th><th>Age</th></tr>
//</thead>
//<tbody>
//<tr><td>Milan</td><td>Jovanovic</td><td>27</td></td>
//<tr><td>Petar</td><td>Petrovic</td><td>29</td></td>
//<tr><td>Darko</td><td>Darkovic</td><td>30</td></td>
//</tbody>
//</table>
//
//    U mainu kreirati jednu tabelu sa 3x3 (3 kolone i 3 reda) i odstampajte je obicno i u html-u.
//
//
//            (DOPUNA 1)
//    U klasi TableRow dodajte metodu koja proverava da li se neki prosledjeni tekst sadrzi u nekoj celiji tog reda. Metoda vraca true ako postoji
//
//    U klasi Table dodajte metodu filter, koja sluzi da filtrira redove tabele u odnosu na prosledjeni tekst. Metoda stampa tabelu, ali samo redove koji sadrze trazeni tekst.
//    Primer izvrsenja: za filter “Milan” stampa se
//    First Name 	|	Last Name 	| 	Age	|
//    Milan			Jovanovic		27
//
//            (DOPUNA 2)
//    U klasi Table dodajte atribut broj redova po strani (najcesce se koristi 5, 10, 25 ili 100 cisto da navedem neki primer).
//    Dodati metodu koja stampa paginator (Sta je paginator?). Paginator stampa koliko strana imamo za redove u tabeli.
//
//            Npr: ako imamo u tabeli 50 redova i broj redova po strani je 10 paginator se stampa
//| 1 | 2 | 3 | 4 | 5
//
//    Zatim izmenite metodu za stampu tako da prima parametar redni broj strane na osnovu koje tabela prikazuje samo elemente te strane. Naravno maksimalno broj elemenata po strani.
//    Primer ako se pozove metoda stampaj za stranu 3 i broj redova po strani je 5, treba da se stampaju redovi od indeksa 10 do 14.
//    Ispod redova tabele odstampajte paginator.
//            Primer tabele
//    First Name 	|	Last Name 	| 	Age	|
//    Milan			Jovanovic		27
//    Marko 			Markovic		30
//    Darko 			Darkovic		60
//
//    Broj redova po strani [3]
//            | 1 | 2 | 3 | 4 | (Objasnjenje: Ovo je paginator.)


    public static void main(String[] args) {

        TableHeader h1 = new TableHeader();
        h1.addHeaderCell("First Name");
        h1.addHeaderCell("Last Name");
        h1.addHeaderCell("Age");

        TableRow r1 = new TableRow();
        r1.addCellRow("Milan");
        r1.addCellRow("Jovanovic");
        r1.addCellRow("27");

        TableRow r2 = new TableRow();
        r2.addCellRow("Petar");
        r2.addCellRow("Petrovic");
        r2.addCellRow("29");

        TableRow r3 = new TableRow();
        r3.addCellRow("Darko");
        r3.addCellRow("Darkovic");
        r3.addCellRow("30");

        TableRow r4 = new TableRow();
        r4.addCellRow("Milan2");
        r4.addCellRow("Jovanovic2");
        r4.addCellRow("27");

        TableRow r5 = new TableRow();
        r5.addCellRow("Petar2");
        r5.addCellRow("Petrovic2");
        r5.addCellRow("29");

        TableRow r6 = new TableRow();
        r6.addCellRow("Darko2");
        r6.addCellRow("Darkovic2");
        r6.addCellRow("30");

        TableRow r7 = new TableRow();
        r7.addCellRow("Milan3");
        r7.addCellRow("Jovanovic3");
        r7.addCellRow("27");

        TableRow r8 = new TableRow();
        r8.addCellRow("Petar3");
        r8.addCellRow("Petrovic3");
        r8.addCellRow("29");

        TableRow r9 = new TableRow();
        r9.addCellRow("Darko3");
        r9.addCellRow("Darkovic3");
        r9.addCellRow("30");

        TableRow r10 = new TableRow();
        r10.addCellRow("Milan4");
        r10.addCellRow("Jovanovic4");
        r10.addCellRow("27");

        TableRow r11 = new TableRow();
        r11.addCellRow("Petar4");
        r11.addCellRow("Petrovic4");
        r11.addCellRow("29");

        TableRow r12 = new TableRow();
        r12.addCellRow("Darko4");
        r12.addCellRow("Darkovic4");
        r12.addCellRow("30");

        TableRow r13 = new TableRow();
        r13.addCellRow("Milan5");
        r13.addCellRow("Jovanovic5");
        r13.addCellRow("27");

        TableRow r14 = new TableRow();
        r14.addCellRow("Petar5");
        r14.addCellRow("Petrovic5");
        r14.addCellRow("29");

        TableRow r15 = new TableRow();
        r15.addCellRow("Darko5");
        r15.addCellRow("Darkovic5");
        r15.addCellRow("30");

        Table x = new Table();
        x.setHeader(h1);
        x.addRow(r1);
        x.addRow(r2);
        x.addRow(r3);
        x.addRow(r4);
        x.addRow(r5);
        x.addRow(r6);
        x.addRow(r7);
        x.addRow(r8);
        x.addRow(r9);
        x.addRow(r10);
        x.addRow(r11);
        x.addRow(r12);
        x.addRow(r13);
//        x.addRow(r14);
//        x.addRow(r15);

//        x.printTableHTML();

//        x.filter("Milan");
        x.print(3);
        x.paginator();


    }
}

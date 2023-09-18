package d11_09_2023.Zadatak1;

public class Zadatak1 {

//    Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
//
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
//
//	U glavnom programu napraviti vise autora sa vise knjiga.

    public static void main(String[] args) {

        Author firstAuthor = new Author("Douglas", "Adams");
        Author secondAuthor = new Author();
        Book firstBook = new Book("0-330-25864-8", "The Hitchhiker's Guide to the Galaxy", 1979);
        Book secondBook = new Book();

        secondAuthor.setFirstName("Eoin");
        secondAuthor.setLastName("Colfer");

        secondBook.setISBN("978-1-4013-2358-5");
        secondBook.setName("And Another Thing... ");
        secondBook.setYear(2009);
        secondBook.setAuthor(secondAuthor);

        firstBook.setAuthor(firstAuthor);

        firstBook.print();
        System.out.println();
        secondBook.print();


    }
}

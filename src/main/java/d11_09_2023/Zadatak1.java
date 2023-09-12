package d11_09_2023;

public class Zadatak1 {
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

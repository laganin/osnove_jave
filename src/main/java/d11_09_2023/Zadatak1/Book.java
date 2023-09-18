package d11_09_2023.Zadatak1;

public class Book {

    private String ISBN;
    private String name;
    private int year;
    private Author author;

    public Book() {
    }

    public Book(String ISBN, String name, int year) {
        this.ISBN = ISBN;
        this.name = name;
        this.year = year;
    }

    public void print() {
        System.out.println("International Standard Book Number is: " + this.ISBN);
        System.out.println("Book name and year published: " + this.name + " - " + this.year);
        if (this.author != null) {
            this.author.print();
        }
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

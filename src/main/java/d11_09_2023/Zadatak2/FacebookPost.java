package d11_09_2023.Zadatak2;

import d11_09_2023.Zadatak2.User;

public class FacebookPost {

//metoda print, stampa u formatu:
//(ime) (prezime)
//(opis post-a)

    public String content;
    public User createdBy;

    public void print() {
        this.createdBy.print();
        System.out.println("Posted: " + this.content);
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }
}

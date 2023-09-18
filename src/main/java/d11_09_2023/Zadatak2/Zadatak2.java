package d11_09_2023.Zadatak2;

public class Zadatak2 {

//    Kreirati klasu Korisnik koja ima
//ime
//prezime
//gettere i settere za ime i prezime
//konstuktore koje mislite da su vam potrebni
//metoda koja stampa u formatu:
//(ime) (prezime)
//
//Kreirati klasu FacebookPost
//opis
//korisnik (referenca na korisnika koji je kreirao post)
//konstrukore koje mislite da su vam potrebni
//metoda print, stampa u formatu:
//(ime) (prezime)
//(opis post-a)
//
//U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda

    public static void main(String[] args) {

        User user = new User("Milan", "Jovanovic");
        FacebookPost post = new FacebookPost();

        post.setContent("Las Vegas baby!");
        post.setCreatedBy(user);
        post.print();

    }
}

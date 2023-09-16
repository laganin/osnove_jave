package p14_09_2023.Zadatak4;

public class Zadatak4 {

//Kreirati klasu InstagramUser koja ima:
//username
//Ime i prezime
//email
//Sve sto vam dalje zatreba dopunite klasu.
//Kreiarti klasu InstagramTag koja ima:
//x koordinatu na slici
//y koordinatu na slici
//usera koji je tagovan
//Kreirati klasu InstagramImage koja ima:
//niz tagova
//duzinu slike
//visinu slike
//putanju do slike (npr: instagram.com/korsnik-pera/profilna.jpg)
//metodu dodajTag
//
//Kreirati klasu InstagramPost koja ima
//niz slika
//Opis koji moze da se postavi za post
//metodu dodajSliku


    public static void main(String[] args) {

        InstagramUser user1 = new InstagramUser("Kuzma", "Vladimir Kuzmanovic", "kuzma@gmail.com");
        InstagramUser user2 = new InstagramUser("Olmajti", "Ana Laganin", "email@email.com");

        InstagramTag tag1 = new InstagramTag(1, 1, user1);

        InstagramImage image = new InstagramImage(220, 200, "instagram.com/korsnik-pera/profilna.jpg");
        InstagramImage image1 = new InstagramImage(500, 500, "instagram.com/korisnik-pera/profilna1.jpg");

        InstagramPost post = new InstagramPost("Hello");

        image.addTag(tag1);
        post.addImage(image);
        post.addImage(image1);

    }
}

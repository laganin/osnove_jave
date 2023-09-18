package d08_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

//Kreirati klasu FacebookPost koja ima:
//   Od atributa:
//ime i prezime korisnika koji je objavio post
//ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//tekst objave
//broj lajkova
//broj deljenja
//  Od metoda:
//like(), koja povecava broj lajkova za 1.
//dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//share(), koja povecava broj deljenja za 1
//print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)
//
//U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//Primer stampanja:
//Milan Jovanovic >>> Pera Peric
//Ovo je tekst objave
//Likes 3 | Shares 1

        FacebookPost ID1 = new FacebookPost();
        FacebookPost ID2 = new FacebookPost();

        ID1.fromName = "Zack Edey";
        ID1.toName = "Dylan Brooks";
        ID1.post = "The score is even.";
        ID1.like = 94;
        ID1.share = 624;

        ID1.print();
        ID1.addLike();
        ID1.addLike();
        ID1.addLike();
        ID1.addLike();
        ID1.dislike();
        ID1.dislike();
        ID1.dislike();
        ID1.dislike();
        ID1.dislike();
        ID1.addShare();
        ID1.addShare();
        ID1.addShare();
        ID1.addShare();
        ID1.addShare();
        ID1.print();

        System.out.println();

        ID2.fromName = "Michael Bridges";
        ID2.toName = "Austin Reeves";
        ID2.post = "Nice game.";
        ID2.like = 96;
        ID2.share = 1440;
        ID2.print();
        ID2.addLike();
        ID2.addLike();
        ID2.addLike();
        ID2.addLike();
        ID2.addLike();
        ID2.dislike();
        ID2.dislike();
        ID2.dislike();
        ID2.dislike();
        ID2.dislike();
        ID2.dislike();
        ID2.dislike();
        ID2.dislike();
        ID2.dislike();
        ID2.addShare();
        ID2.addShare();
        ID2.addShare();
        ID2.addShare();
        ID2.addShare();
        ID2.addShare();
        ID2.print();
    }
}

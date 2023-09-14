package p14_09_2023;

public class Zadatak2 {

//Kreirati klasu Reakcija koja ima
//tip reakcije (smajli, like, srce)
//ime i prezime korisnika koji je reagovao
//gettere, settere i konstruktore
//
//Kreirati klasu FacebookPost koja ima:
//ime i prezime korisnika koji je stavio oglas
//tekst objave
//niz reakcija
//metodu reaguj, koja dodaje reakciju u niz
//(modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post (tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
//Primer: Milan - lajkuje
//	 Nemanja - lajkuje
//	 Milan - daje srce
//Post ima lajk od Nemanje i srce od Milana.
//privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//
//brojReakcija(“smajli) => 3
//brojReakcija(“srce”) => 2
//brojReakcija(“like”) => 1
//brojReakcija(“cry”) => 0
//
//
//metodu stampaj koja stampa podatke u formatu:
//ime i prezime
//tekst objave
//Smajli 10 | Like 15 | Srce 2


    public static void main(String[] args) {

        Reakcija prva = new Reakcija("smile", "Milan Jovanovic");
        Reakcija druga = new Reakcija("like", "Vladimir Minic");
        Reakcija treca = new Reakcija("heart", "Aleksandar Rogic");
        Reakcija cetvrta = new Reakcija("heart", "Milan Jovanovic");
        FacebookPost post = new FacebookPost("Goran Cokic", "Cao svima");

        post.dodajReakciju(prva);
        post.dodajReakciju(druga);
        post.dodajReakciju(treca);
        post.dodajReakciju(cetvrta);
        post.dodajReakciju(prva);

        post.print();

    }
}

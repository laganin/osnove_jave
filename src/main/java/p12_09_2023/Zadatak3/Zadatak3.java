package p12_09_2023.Zadatak3;

public class Zadatak3 {

//Kreirati klasu ViberKorisnik koja ima:
//ime i prezime
//broj telefona
//da li je trenutno aktivan (boolean)
//gettere, settere, konstuktore
//
//Kreirati klasu ViberPoruka koja ima:
//tekst poruke
//vreme kad je poslata poruka
//korisnika koji je poslao poruku
//korisnika kome je poslata poruka
//gettere i setere i konstuktore
//rekaciju na poruku
//metodu prikazi koja stampa podatke o poruci u formatu:
//From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
//To: [Ime i prezime korisnika kome je poslata]
//[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]
//
//
//Kreirati klasu ViberReakcija koja ima:
//emoji (moze da bude sunglases, heart, smile, like ili sad)
//korisnika koji je reagovao
//U mainu kreirati nekoliko poruka izmedju dva korisnika i postavite nekoliko reakcija na poruke.

    public static void main(String[] args) {

        ViberMessage hello = new ViberMessage();
        ViberMessage bye = new ViberMessage();
        ViberUser me = new ViberUser();
        ViberUser you = new ViberUser();
        ViberReaction smile = new ViberReaction();
        ViberReaction sunglasses = new ViberReaction();

        smile.setEmoji("smile");
        smile.setWhoReacted(me);
        sunglasses.setEmoji("sunglasses");
        sunglasses.setWhoReacted(you);

        me.setFullName("Ana Laganin");
        me.setPhoneNumber("+38166187265");
        me.setActive(false);

        you.setFullName("Primalac");
        you.setPhoneNumber("+381987654321");
        you.setActive(true);

        hello.setText("Hello");
        hello.setTime("12:10");
        hello.setSender(me);
        hello.setReceiver(you);
        hello.setEmoji(smile);


        bye.setText("Bye");
        bye.setTime("12:12");
        bye.setSender(you);
        bye.setReceiver(me);
        bye.setEmoji(sunglasses);


        hello.print();
        System.out.println();
        bye.print();

    }
}

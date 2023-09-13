package p12_09_2023;

public class Zadatak3 {
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

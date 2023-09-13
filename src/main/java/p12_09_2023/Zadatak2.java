package p12_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        User host = new User("IT Bootcamp");
        User guest = new User("Milan Jovanovic");
        ZoomCall call = new ZoomCall("google.com", "password", guest, host);

        host.subscription(100);
        guest.subscription(150);
        guest.voidSubscription();
        call.print();

    }
}

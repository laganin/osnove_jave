package p12_09_2023.Zadatak2;

import p12_09_2023.Zadatak2.User;

public class ZoomCall {

    private String link;
    private String password;
    private User host;
    private User guest;

    public ZoomCall(String link, String password, User guest, User host) {
        this.guest = guest;
        this.host = host;
        this.link = link;
        this.password = password;
    }

    public void print() {
        System.out.println("Zoom Call: " + this.link);
        System.out.println("Password: " + this.password);
        System.out.println("Host: " + this.host.getFullName());
        System.out.println("Guest: " + this.guest.getFullName());
        System.out.println("Maximum call length is " + this.guest.maxCallLength() + " min");

    }

    public String getLink() {
        return this.link;
    }

//    public void setLink(String link) {
//        this.link = link;
//    }

    public String getPassword() {
        return this.password;
    }

//    public void setPassword(String password) {
//        this.password = password;
//    }

    public User getHost() {
        return this.host;
    }

//    public void setHost(User host) {
//        this.host = host;
//    }

    public User getGuest() {
        return this.guest;
    }

    public void setGuest(User guest) {
        this.guest = guest;
    }
}

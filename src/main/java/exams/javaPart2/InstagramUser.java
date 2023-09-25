package exams.javaPart2;

public class InstagramUser {

    private String username;
    private String fullName;

    public InstagramUser() {
    }

    public InstagramUser(String username) {
        this.username = username;
    }

    public InstagramUser(String username, String fullName) {
        this.username = username;
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void print() {
        System.out.println("@" + this.username + " " + this.fullName);
    }

    public String link() {
        return "https://www.instagram.com/" + this.username + "/";
    }
}

package p14_09_2023.Zadatak4;

public class InstagramUser {

    private String username;
    private String fullName;
    private String email;

    public InstagramUser(String username, String fullName, String email) {
        this.username = username;
        this.fullName = fullName;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
}

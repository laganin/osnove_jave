package p14_09_2023.Zadatak5;

public class HistoryPage {

    private String name;
    private String link;
    private int hourOpened;
    private int minOpened;
    private String username;
    private String password;


    public HistoryPage(String name, String link, int hourOpened, int minOpened) {
        this.name = name;
        this.link = link;
        this.hourOpened = hourOpened;
        this.minOpened = minOpened;

    }

    public void createCookies (String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public int getHourOpened() {
        return hourOpened;
    }

    public int getMinOpened() {
        return minOpened;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setHourOpened(int hourOpened) {
        this.hourOpened = hourOpened;
    }

    public void setMinOpened(int minOpened) {
        this.minOpened = minOpened;
    }

    public void removeCookies() {
        this.username = null;
        this.password = null;
    }

    public void print() {
        System.out.print(this.hourOpened + " - " + this.minOpened + " - " + this.name + " . . . ");
        if (this.username != null && this.password != null) {
            System.out.println(this.link + "*");
        } else System.out.println(this.link);
    }
}

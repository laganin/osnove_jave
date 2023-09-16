package p14_09_2023.Zadatak5;

import java.util.ArrayList;

public class History {

    private ArrayList<HistoryPage> pages;

    public History() {
        this.pages = new ArrayList<>();
    }

    public void openPage(HistoryPage page) {
        this.pages.add(page);
    }

    public void remove(String link) {
        for (int i = 0; i < this.pages.size(); i++) {
            if (this.pages.get(i).getLink().equals(link)) {
                this.pages.remove(this.pages.get(i));
            }
        }
    }

    public void removeCookiesForLink(String link) {
        for (int i = 0; i < this.pages.size(); i++) {
            if (this.pages.get(i).getLink().equals(link)) {
                this.pages.get(i).removeCookies();
            }
        }
    }

    public void removeHistory() {
        for (int i = 0; i < this.pages.size(); i++) {
            this.pages.remove(this.pages.get(i));
        }
    }

    public void saveCredentials(String name, String username, String password) {
        for (int i = 0; i < this.pages.size(); i++) {
            if (this.pages.get(i).getName().equals(name)) {
                this.pages.get(i).createCookies(username, password);
            }
        }
    }

    public void checkHistory() {
        for (int i = 0; i < this.pages.size(); i++) {
            this.pages.get(i).print();
        }
    }

    public void clearCookies() {
        for (int i = 0; i < this.pages.size(); i++) {
            this.pages.get(i).removeCookies();
        }
    }

    public void lastHourClearCookies(int hour, int min) {
        int time = hour * 60 + min;
        for (int i = 0; i < this.pages.size(); i++) {
            int pageVisited = this.pages.get(i).getHourOpened() * 60 + this.pages.get(i).getMinOpened();
            int lastHour = time - pageVisited;
            if (lastHour < 60) {
                this.pages.get(i).removeCookies();
            }
        }
    }

    public ArrayList<HistoryPage> getPages() {
        return pages;
    }
}

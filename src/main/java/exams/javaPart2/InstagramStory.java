package exams.javaPart2;

import java.util.ArrayList;

public class InstagramStory {

    private InstagramUser author;
    private String link;
    private String imageLink;
    private ArrayList<InstagramAddOn> addons;
    private ArrayList<InstagramUser> users;

    public InstagramStory() {
        this.addons = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public InstagramStory(InstagramUser author, String imageLink) {
        this.author = author;
        this.imageLink = imageLink;
        this.addons = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public InstagramUser getAuthor() {
        return author;
    }

    public String getLink() {
        return link;
    }

    public String getImageLink() {
        return imageLink;
    }

    public ArrayList<InstagramAddOn> getAddons() {
        return addons;
    }

    public ArrayList<InstagramUser> getUsers() {
        return users;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void addAddon(InstagramAddOn x) {
        this.addons.add(x);
    }

    public void removeAddon(String x) {
        for (int i = 0; i < this.addons.size(); i++) {
            if (x.equals(this.addons.get(i).ID)) {
                this.addons.remove(i);
            }
        }
    }

    private boolean alreadySeen(String username) {
        for (int i = 0; i < this.users.size(); i++) {
            if (username.equals(this.users.get(i).getUsername())) {
                return true;
            }
        }
        return false;
    }

    public void seen(InstagramUser x) {
        if (!alreadySeen(x.getUsername())) {
            this.users.add(x);
        }
    }

    public void publish() {
        this.author.print();
        System.out.println("Story:");
        System.out.print("Image: ");
        System.out.println(this.imageLink);
        for (int i = 0; i < this.addons.size(); i++) {
            this.addons.get(i).print();
        }
        if (!this.link.isEmpty()) {
            System.out.println("<<< swipe up >>>");
            System.out.println(this.link);
        }
    }

    private int views() {
        return this.users.size();
    }

    public void viewers() {
        System.out.println("Viewers " + views());
        for (int i = 0; i < this.users.size(); i++) {
            this.users.get(i).print();
        }
    }
}

package d11_09_2023.Zadatak3;

public class Video {
    private String ID;
    private String name;
    private int lengthSec;
    private int like;
    private int dislike;
    private int views;

    public Video(String ID, String name, int lengthSec, int like, int dislike, int views) {
        this.ID = ID;
        this.name = name;
        this.lengthSec = lengthSec;
        this.like = like;
        this.dislike = dislike;
        this.views = views;
    }

    public void addLike() {
        this.like++;
    }

    public void addDislike() {
        this.dislike++;
    }

    public void addView() {
        this.views++;
    }

    public String getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    public int getLengthSec() {
        return this.lengthSec;
    }

    public int getLike() {
        return this.like;
    }

    public int getDislike() {
        return this.dislike;
    }

    public int getViews() {
        return this.views;
    }

}

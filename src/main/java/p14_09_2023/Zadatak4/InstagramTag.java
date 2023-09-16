package p14_09_2023.Zadatak4;

public class InstagramTag {

    private int x;
    private int y;
    private InstagramUser taggedUser;

    public InstagramTag(int x, int y, InstagramUser taggedUser) {
        this.x = x;
        this.y = y;
        this.taggedUser = taggedUser;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public InstagramUser getTaggedUser() {
        return taggedUser;
    }
}

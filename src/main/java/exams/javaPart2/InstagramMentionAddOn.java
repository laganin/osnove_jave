package exams.javaPart2;

import p07_09_2023.User;

public class InstagramMentionAddOn extends InstagramAddOn {

    private InstagramUser tagged;

    public InstagramMentionAddOn(String ID, int x, int y, int width, int height, InstagramUser tagged) {
        super(ID, x, y, width, height);
        this.tagged = tagged;
    }

    public InstagramUser getTagged() {
        return tagged;
    }

    public void setTagged(InstagramUser tagged) {
        this.tagged = tagged;
    }

    @Override
    public int minWidth() {
        return 50;
    }

    @Override
    public int minHeight() {
        return 80;
    }

    @Override
    public void print() {
        System.out.print(this.x + "," + this.y + " (" + this.width + "," + this.height + ")");
        this.tagged.print();
    }
}

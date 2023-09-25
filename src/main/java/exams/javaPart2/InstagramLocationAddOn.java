package exams.javaPart2;

public class InstagramLocationAddOn extends InstagramAddOn {

    private String location;

    public InstagramLocationAddOn(String ID, int x, int y, int width, int height, String location) {
        super(ID, x, y, width, height);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int minWidth() {
        return 100;
    }

    @Override
    public int minHeight() {
        return 50;
    }

    @Override
    public void print() {
        System.out.println(this.x + ", " + this.y + "(" + this.width + ", " + this.height + ")" + "L " + this.location);
    }
}

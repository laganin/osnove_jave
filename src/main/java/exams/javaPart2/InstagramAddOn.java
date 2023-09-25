package exams.javaPart2;

public abstract class InstagramAddOn {

    protected String ID;
    protected int x;
    protected int y;
    protected int width;
    protected int height;

    public InstagramAddOn(String ID, int x, int y, int width, int height) {
        this.ID = ID;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public String getID() {
        return ID;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public abstract int minWidth();

    public abstract int minHeight();

    public void increaseDimensions(int width, int height) {
        this.height += height;
        this.width += width;
    }

    public void decreaseDimensions(int width, int height) {
        if (minHeight() > height) {
            this.height -= height;
        }
        if (minWidth() > width) {
            this.width -= width;
        }
    }

    public abstract void print();
}

package p14_09_2023.Zadatak4;

import java.util.ArrayList;

public class InstagramImage {

    private ArrayList<InstagramTag> tags;
    private int imageWidth;
    private int imageLength;
    private String imagePath;

    public InstagramImage(int imageWidth, int imageLength, String imagePath) {
        this.imageWidth = imageWidth;
        this.imageLength = imageLength;
        this.imagePath = imagePath;
        this.tags = new ArrayList<>();
    }

    public void addTag(InstagramTag tag) {
        this.tags.add(tag);
    }

    public ArrayList<InstagramTag> getTags() {
        return tags;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public int getImageLength() {
        return imageLength;
    }

    public String getImagePath() {
        return imagePath;
    }
}

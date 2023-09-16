package p14_09_2023.Zadatak4;

import java.util.ArrayList;

public class InstagramPost {

    private ArrayList<InstagramImage> images;
    private String postBody;

    public InstagramPost(String postBody) {
        this.postBody = postBody;
        this.images = new ArrayList<>();
    }

    public void addImage (InstagramImage image){
        this.images.add(image);
    }

    public ArrayList<InstagramImage> getImages() {
        return images;
    }

    public String getPostBody() {
        return postBody;
    }
}

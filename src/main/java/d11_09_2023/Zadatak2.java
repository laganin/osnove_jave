package d11_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        User user = new User("Milan", "Jovanovic");
        FacebookPost post = new FacebookPost();

        post.setContent("Las Vegas baby!");
        post.setCreatedBy(user);
        post.print();

    }
}

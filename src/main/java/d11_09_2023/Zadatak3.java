package d11_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        Video art = new Video("tcYodQoapMg", "Ariana Grande - positions (official video)", 177, 83, 0, 528);
        YouTubePlayer player = new YouTubePlayer();

        player.loadVideo(art);
        player.fastForward();
        player.fastForward();
        player.increaseVolume();
        player.increaseVolume();
        player.increaseVolume();
        player.increaseVolume();
        player.increaseVolume();
        player.increaseVolume();
        player.increaseVolume();
        player.increaseVolume();
        player.increaseVolume();
        player.increaseVolume();
        player.increaseVolume();
        player.setQuality(10);
        player.activateFullScreenPlayer();
        player.print();
        String share = player.videoShare();
        System.out.println(share);


    }
}

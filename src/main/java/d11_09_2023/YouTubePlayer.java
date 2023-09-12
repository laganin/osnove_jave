package d11_09_2023;

public class YouTubePlayer {

    private Video videoInfo;
    private int videoQuality;
    private String mode;
    private int volume;
    private int currentTime;

    public YouTubePlayer() {
        this.volume = 75;
        this.videoQuality = 144;
        this.mode = "mini player";
    }

    public void loadVideo(Video video) {
        this.videoInfo = video;
        int views = video.getViews();
        this.currentTime = 0;
        views = views + 1;
    }
//
    public void increaseVolume() {
        if (this.volume < 100) {
            this.volume = this.volume + 10;
        }
    }
//
    public void decreaseVolume() {
        if (this.volume > 0) {
            this.volume = this.volume - 10;
        }
    }

    public void setQuality(int internetSpeed) {
        if (internetSpeed > 8) {
            this.videoQuality = 1080;
        }
        if (internetSpeed <= 2) {
            this.videoQuality = 144;
        }
        if (internetSpeed > 2 & internetSpeed <= 4) {
            this.videoQuality = 240;
        }
        if (internetSpeed > 4 & internetSpeed <= 6) {
            this.videoQuality = 360;
        }
        if (internetSpeed > 6 & internetSpeed <= 8) {
            this.videoQuality = 720;
        }
    }

    public void activateMiniPlayer() {
        this.mode = "mini player";
    }

    public void activateMoviePlayer() {
        this.mode = "movie mode";
    }

    public void activateFullScreenPlayer() {
        this.mode = "full screen";
    }

    public void fastForward() {
        if (this.currentTime < this.videoInfo.getLengthSec()) {
            this.currentTime = this.currentTime + 10;
        }
    }

    public void rewind() {
        if (this.currentTime > 10) {
            this.currentTime = this.currentTime - 10;
        }
    }

    public void printVolume() {
        int line = this.volume / 10;
        if (line > 0) {
            System.out.print("<: ");
            for (int i = 0; i < line; i++) {
                System.out.print("|");
            }
        } else System.out.println("</");
    }

    public void printMode() {
        if (this.mode.contains("mini player")) {
            System.out.println("[]");
        }
        if (this.mode.contains("movie mode")) {
            System.out.println("[..]");
        }
        if (this.mode.contains("full screen")) {
            System.out.println("[||||]");
        }
    }

    public void printCurrentTime() {
        int minute = this.currentTime / 60;
        int sec = this.currentTime % 60;
        int totalMinute = this.videoInfo.getLengthSec() / 60;
        int totalSec = this.videoInfo.getLengthSec() % 60;
        System.out.print(minute + ":" + sec + "/" + totalMinute + ":" + totalSec);
    }

    public void printTimeline() {
        int stars = currentTime * 100 / this.videoInfo.getLengthSec();
        int dot = 100 - stars;
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < dot; i++) {
            System.out.print(".");
        }
    }

    public void print() {
        printCurrentTime(); System.out.print(" Volume: "); printVolume();
        System.out.println();
        System.out.print("Timeline: ");printTimeline();
        System.out.println();
        System.out.println("Quality: " + this.videoQuality + "p");
        System.out.print("Mode: "); printMode();
        System.out.println(this.videoInfo.getName());
        System.out.println("Likes " + this.videoInfo.getLike() + " | Dislikes " + this.videoInfo.getDislike());
        System.out.println(this.videoInfo.getViews() + " views");
    }

    public String videoShare() {
        String link = "https://youtu.be/" + this.videoInfo.getID();
        return link;
    }

    public Video getVideoInfo() {
        return this.videoInfo;
    }

    public int getVideoQuality() {
        return this.videoQuality;
    }

    public String getMode() {
        return this.mode;
    }

    public int getVolume() {
        return this.volume;
    }

    public int getCurrentTime() {
        return this.currentTime;
    }
}

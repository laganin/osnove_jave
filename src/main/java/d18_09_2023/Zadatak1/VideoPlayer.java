package d18_09_2023.Zadatak1;

public class VideoPlayer {

    private int videoDuration;
    private int currentTime;
    private int volume;
    private double videoQuality;

    public VideoPlayer(int videoDuration, int currentTime, int volume, double videoQuality) {
        this.videoDuration = videoDuration;
        this.currentTime = currentTime;
        this.volume = volume;
        this.videoQuality = videoQuality;
    }

    public int getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(int videoDuration) {
        this.videoDuration = videoDuration;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getVideoQuality() {
        return videoQuality;
    }

    public void setVideoQuality(double videoQuality) {
        this.videoQuality = videoQuality;
    }

    public void print() {
        System.out.println("Current video time: " + this.currentTime);
        System.out.println("Volume: " + this.volume);
        System.out.println("Video quality: " + this.videoQuality);
    }
}

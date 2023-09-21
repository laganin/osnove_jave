package d18_09_2023.Zadatak1;

import d18_09_2023.Zadatak1.Control;
import d18_09_2023.Zadatak1.VideoPlayer;

public class QualityOptimizerControl extends Control {

    private double internetSpeed;

    public QualityOptimizerControl(double internetSpeed) {
        this.internetSpeed = internetSpeed;
    }

    public double getInternetSpeed() {
        return internetSpeed;
    }

    public void setInternetSpeed(double internetSpeed) {
        this.internetSpeed = internetSpeed;
    }

    @Override
    public void execute(VideoPlayer x) {
        double speed = this.internetSpeed * 10.1;
        if (speed <= 144) {
            x.setVideoQuality(144);
        }
        if (speed > 144 & speed <= 240) {
            x.setVideoQuality(240);
        }
        if (speed > 240 & speed <= 360) {
            x.setVideoQuality(360);
        }
        if (speed > 360 & speed <= 480) {
            x.setVideoQuality(480);
        }
        if (speed > 480 & speed <= 720) {
            x.setVideoQuality(720);
        }
        if (speed > 720) {
            x.setVideoQuality(1080);
        }
    }
}
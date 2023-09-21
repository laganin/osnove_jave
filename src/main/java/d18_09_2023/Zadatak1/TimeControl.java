package d18_09_2023.Zadatak1;

import d18_09_2023.Zadatak1.Control;
import d18_09_2023.Zadatak1.VideoPlayer;

public class TimeControl extends Control {

    private boolean skip;

    public TimeControl(boolean skip) {
        this.skip = skip;
    }

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    @Override
    public void execute(VideoPlayer x) {

        if (this.skip && x.getCurrentTime() < x.getVideoDuration() - 15) {
            x.setCurrentTime(x.getCurrentTime() + 15);
        }
        if (!this.skip && x.getCurrentTime() > 15) {
            x.setCurrentTime(x.getCurrentTime() - 15);
        }
    }
}

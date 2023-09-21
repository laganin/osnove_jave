package d18_09_2023.Zadatak1;

public class AudioControl extends Control {

    private boolean increase;

    public AudioControl(boolean control) {
        this.increase = control;
    }

    public boolean isIncrease() {
        return increase;
    }

    public void setIncrease(boolean increase) {
        this.increase = increase;
    }

    @Override
    public void execute(VideoPlayer x) {
        if (this.increase && x.getVolume() < 100) {
            x.setVolume(x.getVolume() + 1);
        }
        if (!this.increase && x.getVolume() > 0) {
            x.setVolume(x.getVolume() - 1);
        }
    }
}

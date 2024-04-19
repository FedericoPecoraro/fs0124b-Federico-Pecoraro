package player.mediaplayer;

public abstract class playable extends media implements playFunctions {
    private int duration;
    private int volume;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void play() {

    }

    @Override
    public void VolumeUp() {

    }

    @Override
    public void VolumeDown() {

    }
}

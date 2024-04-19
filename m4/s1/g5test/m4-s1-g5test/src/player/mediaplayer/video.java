package player.mediaplayer;

public class video extends playable implements viewFunctions {
    private int brightness;

    public video(String title, int duration) {
        super.setTitle(title);
        super.setDuration(duration);
        this.setVolume(50);
        this.setBrightness(50);
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public void play() {

        for (int i = 0; i < this.getDuration(); i++) {

            System.out.print(this.getTitle() + " - ");

            for (int j = 0; j < this.getVolume(); j++) {
                System.out.print("!");
            }

            System.out.print(" - ");
            for (int k = 0; k < this.getBrightness(); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    @Override
    public void brightnessUp() {
        if (this.getBrightness() < 100) {
            brightness++;
        } else {
            System.out.println("Luminosità massima");
        }
    }

    @Override
    public void brightnessDown() {
        if (this.getBrightness() > 0) {
            brightness--;
        } else {
            System.out.println("Luminosità minima");
        }
    }
}

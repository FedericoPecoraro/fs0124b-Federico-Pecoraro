package player.mediaplayer;

public class image extends media implements viewFunctions{
    private int brightness;

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
    public void show() {
        System.out.print(this.getTitle());

        for (int i = 0; i < this.getBrightness(); i++) {

            System.out.print("*");
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

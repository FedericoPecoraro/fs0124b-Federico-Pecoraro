package player.mediaplayer;

public class video extends playable implements viewFunctions {
    private int brightness = 5; //variabile di tipo int settata a 5

    public video(String title, int duration) { //costruttore che accetta due parametri, titolo e durata
        super.setTitle(title);
        super.setDuration(duration);
    }

    public int getBrightness() {
        return brightness; //restituisce il valore della luminosità
    }

    @Override
    public void play() { //funzione che riproduce il video

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
    public void brightnessUp() { //funzione che aumenta la luminosità
        if (this.getBrightness() < 10) {
            brightness++;
        } else {
            System.out.println("Luminosità massima");
        }
    }

    @Override
    public void brightnessDown() { //funzione che diminuisce la luminosità
        if (this.getBrightness() > 0) {
            brightness--;
        } else {
            System.out.println("Luminosità minima");
        }
    }
}

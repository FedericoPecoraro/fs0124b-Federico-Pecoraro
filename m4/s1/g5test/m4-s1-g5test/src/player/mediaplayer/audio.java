package player.mediaplayer;

public class audio extends playable implements playFunctions{

    public audio(String title, int duration) { //costruttore che accetta due parametri, titolo e durata
        super.setTitle(title);
        super.setDuration(duration);
    }

    @Override
    public void play() { //metodo che riproduce l'audio
        for (int i = 0; i < this.getDuration(); i++) {
            System.out.print(this.getTitle() + " - ");
            for (int j = 0; j < this.getVolume(); j++) {
                System.out.print("!");
            }
            System.out.println("");
        }
    }
}

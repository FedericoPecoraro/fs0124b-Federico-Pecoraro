package player.mediaplayer;

public abstract class playable extends media implements playFunctions {
    private int duration; //dichiaro una variabile di tipo int
    private int volume = 5; //dichiaro una variabile di tipo int e la setto a 5

    public int getDuration() {
        return duration; //metodo che restituisce la durata
    }
    public void setDuration(int duration) {
        this.duration = duration; //metodo che imposta la durata
    }

    public int getVolume() {
        return volume; //metodo che restituisce il volume
    }

    @Override
    public void play() {
    }

    @Override
    public void volumeUp() {
        if (volume < 10) { //se il volume è minore di 10, aumenta il volume
            volume++;
        } else {
            System.out.println("Volume massimo"); //mando un errore se il volume è massimo
        }
    }

    @Override
    public void volumeDown() {
        if (volume > 0) { //se il volume è maggiore di 0, diminuisce il volume
            volume--;
        } else {
            System.out.println("Volume minimo"); //mando un errore se il volume è minimo
        }
    }
}

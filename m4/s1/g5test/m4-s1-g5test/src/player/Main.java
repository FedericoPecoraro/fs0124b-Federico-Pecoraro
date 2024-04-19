package player;

import player.mediaplayer.audio;
import player.mediaplayer.image;
import player.mediaplayer.video;

public class Main {
    public static void main(String[] args) {
        video movie = new video("Into The Wild", 5); //Creo un nuovo oggetto video
        audio music = new audio("Society", 3); //Creo un nuovo oggetto audio
        image cover = new image("Alexander Supertramp"); //Creo un nuovo oggetto image

        movie.play(); //avvio il video
        movie.brightnessUp(); //aumento la luminosità del video
        movie.volumeUp(); //aumento il volume del video
        movie.play(); //avvio nuovamente il video

        music.play(); //avvio l'audio
        music.volumeDown(); //diminuisco il volume dell'audio
        music.play(); //avvio nuovamente l'audio

        cover.show(); //mostro l'immagine
        cover.brightnessUp(); //aumento la luminosità dell'immagine
        cover.show(); //mostro nuovamente l'immagine
    }
}
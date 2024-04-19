package player.mediaplayer;

public class image extends media implements viewFunctions{
    private int brightness = 5; //dichiaro una variabile di tipo int e setto il valore

    public image(String title) {
        super.setTitle(title); //imposto il titolo dell'immagine
    }

    public int getBrightness() {
        return brightness; //metodo che restituisce la luminosità dell'immagine'
    }

    public void show() {
        System.out.print(this.getTitle() + " - "); //stampo il titolo dell'immagine'
        for (int i = 0; i < this.getBrightness(); i++) {
            System.out.print("*"); //stampo un asterisco
        }
    }

    @Override
    public void brightnessUp() {
        if (this.getBrightness() < 10) {
            brightness++; //imposto la luminosità massima a 10
        } else {
            System.out.println("Luminosità massima"); //do un errore se la luminosità è massima
        }
        System.out.println("");
    }

    @Override
    public void brightnessDown() {
        if (this.getBrightness() > 0) { //imposto la luminosità minima a 0
            brightness--;
        } else {
            System.out.println("Luminosità minima"); //do un errore se la luminosità è minima
        }
    }
}

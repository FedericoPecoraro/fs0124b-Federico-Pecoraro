package classi;

public class Rettangolo {
    private int altezza;
    private int larghezza;


    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }
    public int getAltezza() {
        return altezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }
    public int getLarghezza() {
        return larghezza;
    }

    public int perimetro() {
        return (this.altezza + this.larghezza)*2;
    }
    public int area() {
        return (this.altezza * this.larghezza);
    }



}

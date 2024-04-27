package it.epicode.test;

public class Magazine extends Publication {
    private Frequency frequency;

    public Magazine(Long ISBN, String title, int publicYear, int pagesNumber, Frequency frequency) {
        super(ISBN, title, publicYear, pagesNumber);
        this.frequency = frequency;
    }

    public Frequency getFrequency() {
        return frequency;
    }
    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return super.toString() + " Rivista (" + "frequenza=" + frequency + ')';
    }
}

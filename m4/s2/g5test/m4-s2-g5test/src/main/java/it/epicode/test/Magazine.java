package it.epicode.test;

public class Magazine extends Publication {
    private Frequency frequency;

    public Magazine(Long ISBN, String title, int publicYear, int pagesNumber, Frequency frequency) {
        this.frequency = frequency;
        super.setISBN(ISBN);
        super.setTitle(title);
        super.setPublicYear(publicYear);
        super.setPagesNumber(pagesNumber);
    }

    public Frequency getFrequency() {
        return frequency;
    }
    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }
}

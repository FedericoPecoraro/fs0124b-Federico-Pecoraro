package it.epicode.test;

public abstract class Publication {
    private Long ISBN;
    private String title;
    private int publicYear;
    private int pagesNumber;

    public Publication() {}

    public Long getISBN() {
        return ISBN;
    }
    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicYear() {
        return publicYear;
    }
    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }
    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

}

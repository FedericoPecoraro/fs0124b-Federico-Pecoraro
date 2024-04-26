package it.epicode.test;

public class Book extends Publication{
    private String author;
    private String genre;

    public Book(Long ISBN, String title, int publicYear, int pagesNumber, String author, String genre) {
        this.author = author;
        this.genre = genre;

        super.setISBN(ISBN);
        super.setTitle(title);
        super.setPublicYear(publicYear);
        super.setPagesNumber(pagesNumber);
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}

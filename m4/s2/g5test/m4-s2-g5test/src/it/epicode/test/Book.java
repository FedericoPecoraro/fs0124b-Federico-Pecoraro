package it.epicode.test;

public class Book extends Publication{
    private String author;
    private String genre;

    public Book(Long ISBN, String title, int publicYear, int pagesNumber, String author, String genre) {
        super(ISBN, title, publicYear, pagesNumber);
        this.author = author;
        this.genre = genre;
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

    @Override
    public String toString() {
        return "Libro{" + "autore='" + author + '\'' + ", genere='" + genre + '\'' + '}';
    }
}


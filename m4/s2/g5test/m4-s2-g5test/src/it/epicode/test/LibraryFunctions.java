package it.epicode.test;

import java.util.List;

public interface LibraryFunctions{
    void addPublication(Publication publication);

    void removePublicationByISBN(Long ISBN);

    List<Publication> findByISBN(Long ISBN);

    List<Publication> findByYear(int year);

    List<Publication> findByAuthor(String author);

    List<Publication> getAllPublications();

    void save();

    void load();
}

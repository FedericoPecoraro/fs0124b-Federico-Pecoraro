package it.epicode.test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FileLibraryFunctions library = new FileLibraryFunctions();
      //  var bookLibrary = new ArrayList<Book>();
        // Qui ho tentato di creare un nuovo array che contenesse solo i libri, ma non mi piaceva questa soluzione.

        library.addPublication(new Book(12345678L, "Java",2018,1000,"Nello Rizzo","Programming"));
        library.addPublication(new Book(12345679L, "Il Sottosopra",2018,300,"Remo Coca","Programming"));
        library.addPublication(new Magazine(23456789L, "Angular secondo Michele Tedesco",2020, 50, Frequency.WEEKLY));
        library.save();

        Long ISBNToSearch = 12345678L;
        int yearToSearch = 2018;
        String authorToSearch = "Remo Coca";

        var ISBNFound = library.findByISBN(ISBNToSearch);
        var yearFound = library.findByYear(yearToSearch);
        var authorFound = library.findByAuthor(authorToSearch);


        library.removePublicationByISBN(ISBNToSearch);

        ISBNFound.forEach(b -> System.out.println("L'articolo con il codice " + ISBNToSearch + " è " + b.getTitle()));

        System.out.format("%nFound " + yearFound.size() + " articoli pubblicati nel " + yearToSearch + ":%n");
        yearFound.forEach(b -> System.out.println(b.getTitle()));

        authorFound.forEach(b -> System.out.println("L'articolo con l'autore " + authorToSearch + " è " + b.getTitle()));

    }
}
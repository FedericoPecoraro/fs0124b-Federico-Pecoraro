package it.epicode.test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var library = new ArrayList<Publication>();
      //  var bookLibrary = new ArrayList<Book>();

        library.add(new Book(12345678L, "Java",2018,1000,"Nello Rizzo","Programming"));
        library.add(new Book(12345679L, "Il Sottosopra",2018,300,"Remo Coca","Programming"));
        library.add(new Magazine(23456789L, "Angular secondo Michele Tedesco",2020, 50, Frequency.WEEKLY));

        Long ISBNToSearch = 12345678L;
        int yearToSearch = 2018;
        String authorToSearch = "Remo Coca";

        var ISBNFound = library.stream()
                .filter(book -> book.getISBN().equals(ISBNToSearch))
                .toList();
        var yearFound = library.stream()
                .filter(book -> book.getPublicYear() == yearToSearch)
                .toList();
        var authorFound = library.stream()
                .filter(book -> book instanceof Book && ((Book) book).getAuthor().equals(authorToSearch))
                .toList();

        library.removeIf(book -> book.getISBN().equals(ISBNToSearch));

        ISBNFound.forEach(b -> System.out.println("L'articolo con il codice " + ISBNToSearch + " è " + b.getTitle()));

        System.out.format("%nFound " + yearFound.size() + " articoli pubblicati nel " + yearToSearch + ":%n");
        yearFound.forEach(b -> System.out.println(b.getTitle()));

        authorFound.forEach(b -> System.out.println("L'articolo con l'autore " + authorToSearch + " è " + b.getTitle()));

    }
}
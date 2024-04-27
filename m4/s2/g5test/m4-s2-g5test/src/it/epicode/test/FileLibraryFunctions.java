package it.epicode.test;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileLibraryFunctions implements it.epicode.test.LibraryFunctions {
    private static final Logger logger = LoggerFactory.getLogger(FileLibraryFunctions.class);
    private static final String STORAGE = "./library.csv";

    private final ArrayList<Publication> library = new ArrayList<>();

    public FileLibraryFunctions() {
        load();
    }

    @Override
    public void addPublication(Publication publication) {
        library.add(publication);
    }

    @Override
    public void removePublicationByISBN(Long ISBN) {
        library.removeIf(p -> p.getISBN().equals(ISBN));
    }

    @Override
    public List<Publication> findByISBN(Long ISBN) {
        return library.stream()
                .filter(p -> p.getISBN().equals(ISBN))
                .collect(Collectors.toList());
    }

    @Override
    public List<Publication> findByYear(int year) {
        return library.stream()
                .filter(p -> p.getPublicYear() == year)
                .collect(Collectors.toList());
    }

    @Override
    public List<Publication> findByAuthor(String author) {
        return library.stream()
                .filter(p -> p instanceof Book && ((Book) p).getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    @Override
    public List<Publication> getAllPublications() {
        return new ArrayList<>(library);
    }

    @Override
    public void save() {
        File f = new File(STORAGE);
        try {
            FileUtils.write(f, "", StandardCharsets.ISO_8859_1);
            for (Publication p : library) {
                List<String> lines = new ArrayList<>();
                lines.add(p.getClass().getSimpleName());
                lines.add(p.getISBN().toString());
                lines.add(p.getTitle());
                lines.add(String.valueOf(p.getPublicYear()));
                lines.add(String.valueOf(p.getPagesNumber()));
                if (p instanceof Book) {
                    Book l = (Book) p;
                    lines.add(l.getAuthor());
                    lines.add(l.getGenre());
                } else if (p instanceof Magazine) {
                    Magazine r = (Magazine) p;
                    lines.add(r.getFrequency().toString());
                }
                FileUtils.writeStringToFile(f, String.join(",", lines) + System.lineSeparator(), StandardCharsets.ISO_8859_1, true);
            }
        } catch (IOException e) {
            logger.error("Errore durante il salvataggio", e);
        }
    }

    @Override
    public void load() {
        File f = new File(STORAGE);
        if (!f.exists()) return;
        try {
            List<String> lines = FileUtils.readLines(f, StandardCharsets.ISO_8859_1);
            for (String line : lines) {
                String[] parts = line.split(",");
                Long ISBN = Long.parseLong(parts[1]);
                String title = parts[2];
                int publicYear = Integer.parseInt(parts[3]);
                int pagesNumber = Integer.parseInt(parts[4]);
                if ("Libro".equals(parts[0])) {
                    String author = parts[5];
                    String genre = parts[6];
                    library.add(new Book(ISBN, title, publicYear, pagesNumber, author, genre));
                } else if ("Rivista".equals(parts[0])) {
                    Frequency frequency = Frequency.valueOf(parts[5]);

                    library.add(new Magazine(ISBN, title, publicYear, pagesNumber, frequency));
                }
            }
        } catch (IOException e) {
            logger.error("Errore durante il caricamento", e);
        }
    }

}

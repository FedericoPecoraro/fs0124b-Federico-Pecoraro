package it.epicode.library.entities;

import it.epicode.library.entities.constants.Tables;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jdk.jfr.Frequency;

@Entity
@Table(name= Tables.Names.MAGAZINES)
public class Magazine extends LibraryItem {
    @Enumerated
    private Frequency frequency;

    public Magazine() {}
    public Magazine(String isbn, String title, int publicationYear, int pages, Frequency frequency) {
        super(isbn, title, publicationYear, pages);
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
        return "Magazine{" +
                "frequency=" + frequency +
                '}';
    }
}

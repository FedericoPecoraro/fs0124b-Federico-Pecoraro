package it.epicode.library.entities;

import it.epicode.library.entities.constants.Tables;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = Tables.Names.BOOKS)
@DiscriminatorValue(Tables.Discriminators.BOOKS)
public class Book extends LibraryItem {
	@Column(length = 80, nullable = false)
	private String author;
	@Column(length = 20, nullable = false)
	private String kind;

	public Book() {

	}

	public Book(String isbn, String title, int publicationYear, int pages, String author, String kind) {
		super(isbn, title, publicationYear, pages);
		this.author = author;
		this.kind = kind;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Book{" +
				"author='" + author + '\'' +
				", kind='" + kind + '\'' +
				'}';
	}
}

package it.epicode.library.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity

public class Loan extends BaseEntity {
	@ManyToOne
	private User user;

	@ManyToOne
	private LibraryItem item;

	@Temporal(TemporalType.DATE)
	private Date dataInizioPrestito;


	@Temporal(TemporalType.DATE)
	private Date dataRestituzionePrevista;

	@Temporal(TemporalType.DATE)
	private Date dataRestituzioneEffettiva;


	public Loan(){}

	public Loan(User user, LibraryItem item, Date dataInizioPrestito, Date dataRestituzionePrevista, Date dataRestituzioneEffettiva) {
		this.user = user;
		this.item = item;
		this.dataInizioPrestito = dataInizioPrestito;
		this.dataRestituzionePrevista = dataRestituzionePrevista;
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LibraryItem getItem() {
		return item;
	}

	public void setItem(LibraryItem item) {
		this.item = item;
	}

	public Date getDataInizioPrestito() {
		return dataInizioPrestito;
	}

	public void setDataInizioPrestito(Date dataInizioPrestito) {
		this.dataInizioPrestito = dataInizioPrestito;
	}

	public Date getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}

	public void setDataRestituzionePrevista(Date dataRestituzionePrevista) {
		this.dataRestituzionePrevista = dataRestituzionePrevista;
	}

	public Date getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}

	public void setDataRestituzioneEffettiva(Date dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}

	@Override
	public String toString() {
		return "Loan{" +
				"user=" + user +
				", item=" + item +
				", dataInizioPrestito=" + dataInizioPrestito +
				", dataRestituzionePrevista=" + dataRestituzionePrevista +
				", dataRestituzioneEffettiva=" + dataRestituzioneEffettiva +
				'}';
	}
}

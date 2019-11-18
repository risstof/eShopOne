package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Books {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence_Book")
	@SequenceGenerator(name = "id_Sequence_Book", sequenceName = "ID_SEQ_BOOK")
	private long bookId;
	String title;
	String author;
	String format;
	String dimension;
	Date publicationDate;
	String publischer;
	String publicationCity;
	String publicationCountry;
	String language;
	String rank;
	String description;
	String coverPath;

	public Books() {

	}

	public Books(long bookId, String title, String author, String format, String dimension, Date publicationDate,
			String publischer, String publicationCity, String publicationCountry, String language, String rank,
			String description, String coverPath) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.format = format;
		this.dimension = dimension;
		this.publicationDate = publicationDate;
		this.publischer = publischer;
		this.publicationCity = publicationCity;
		this.publicationCountry = publicationCountry;
		this.language = language;
		this.rank = rank;
		this.description = description;
		this.coverPath = coverPath;
	}

	public long getId() {
		return bookId;
	}

	public void setId(long bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getPublischer() {
		return publischer;
	}

	public void setPublischer(String publischer) {
		this.publischer = publischer;
	}

	public String getPublicationCity() {
		return publicationCity;
	}

	public void setPublicationCity(String publicationCity) {
		this.publicationCity = publicationCity;
	}

	public String getPublicationCountry() {
		return publicationCountry;
	}

	public void setPublicationCountry(String publicationCountry) {
		this.publicationCountry = publicationCountry;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCoverPath() {
		return coverPath;
	}

	public void setCoverPath(String coverPath) {
		this.coverPath = coverPath;
	}
}
package com.vkholod.bookcatalog.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue
	@Column(name = "book_id")
	private int bookID;

	@Column(name = "book_name")
	private String bookName;

	@Column(name = "year_published")
	private Date yearPublished;

	@Column(name = "book_isbn")
	private String bookISBN;

	@Column(name = "book_publisher")
	private String bookPublisher;
	
	public Book() {
	}

	public Book(String bookName, Date yearPublished, String bookISBN, String bookPublisher) {
		super();
		this.bookName = bookName;
		this.yearPublished = yearPublished;
		this.bookISBN = bookISBN;
		this.bookPublisher = bookPublisher;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Date getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(Date yearPublished) {
		this.yearPublished = yearPublished;
	}

	public String getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
}
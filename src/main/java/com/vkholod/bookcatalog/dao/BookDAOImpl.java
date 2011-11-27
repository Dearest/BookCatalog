package com.vkholod.bookcatalog.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vkholod.bookcatalog.bean.Book;

@Repository
public class BookDAOImpl implements BookDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addBook(Book book) {
	}

	public Book getBook(int id) {
		return null;
	}

	public Book getBook(String bookName) {
		return null;
	}

	public void updateBook(int id, Book book) {

	}

	public void deleteBook(int id) {
	}

	public List<Book> getAllBooks() {
		return sessionFactory.getCurrentSession().createQuery("from books").list();
	}
}
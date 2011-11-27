package com.vkholod.bookcatalog.dao;

import java.util.List;

import com.vkholod.bookcatalog.bean.Book;

public interface BookDAO {

	public void addBook(Book book);

	public Book getBook(int id);

	public Book getBook(String bookName);

	public void updateBook(int id, Book book);

	public void deleteBook(int id);

	public List<Book> getAllBooks();

}

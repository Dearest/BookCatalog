package com.vkholod.bookcatalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vkholod.bookcatalog.bean.Book;
import com.vkholod.bookcatalog.dao.BookDAO;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDAO;

	@Transactional
	public List<Book> getAllBooks() {
		return bookDAO.getAllBooks();
	}

}

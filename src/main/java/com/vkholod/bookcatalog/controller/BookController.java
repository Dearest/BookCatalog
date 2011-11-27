package com.vkholod.bookcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vkholod.bookcatalog.bean.Book;
import com.vkholod.bookcatalog.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/index")
	public String showAllBooks() throws Exception {
//		List<Book> allBooks = bookService.getAllBooks();
		return "books";
	}
}

package com.bikash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikash.domain.Books;
import com.bikash.service.BooksService;

@RestController
public class BooksController {
	
	@Autowired
	private BooksService service;
	
	@PostMapping("/save-book")
	public String savsBook(@RequestBody Books book) {
		String saveBook = service.saveBook(book);
		return saveBook;
	}
	@GetMapping("/get-book")
	public List<Books> getAllAvailableBooks(){
		List<Books> allBooks = service.getAllBooks();
		return allBooks;
	}

}

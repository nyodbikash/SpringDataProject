package com.bikash.service;

import java.util.List;

import com.bikash.domain.Books;

public interface BooksService {
	public String saveBook();
	public List<Books> getAllBooks();
	public Books getBooksById(int id);
	public void deleteBooksById(int id);
}
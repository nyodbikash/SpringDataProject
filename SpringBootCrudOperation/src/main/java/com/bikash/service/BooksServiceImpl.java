package com.bikash.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikash.domain.Books;
import com.bikash.entity.BooksEntity;
import com.bikash.repo.BooksRepository;

@Service
public class BooksServiceImpl implements BooksService {
	
	@Autowired
	private BooksRepository repo;

	@Override
	public String saveBook(Books book) {
		BooksEntity entity=null;
		//convert book to entity
		entity=new BooksEntity();
		BeanUtils.copyProperties(book, entity);
		entity = repo.save(entity);
		return entity==null?"Books not saved":"books saved";
	}

	@Override
	public List<Books> getAllBooks() {
		List<Books> bookList=new ArrayList<Books>();
		List<BooksEntity> allBook = repo.findAll();
		//converting entity to domain
		allBook.forEach(entity->{
			Books book=new Books();
			BeanUtils.copyProperties(entity, book);
			bookList.add(book);
		});
		return bookList;
	}

	@Override
	public Books getBooksById(int id) {
		BooksEntity booksEntity = repo.findById(id).orElse(null);
		//convert entity to model
		Books book=new Books();
		BeanUtils.copyProperties(booksEntity, book);
		return book;
	}

	@Override
	public void deleteBooksById(int id) {
		repo.deleteById(id);

	}

}

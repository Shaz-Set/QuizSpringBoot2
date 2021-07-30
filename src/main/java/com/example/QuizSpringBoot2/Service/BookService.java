package com.example.QuizSpringBoot2.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuizSpringBoot2.Entity.Book;
import com.example.QuizSpringBoot2.Repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public int addBook(Book book) {
		return bookRepository.insertBook(book);
	}

	public List<Book> findAllBooks() {
		return bookRepository.getAllBooks();
	}

	public Book getBookById(int id) {
		return bookRepository.SelectById(id);
	}
}

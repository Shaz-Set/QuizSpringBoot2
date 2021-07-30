package com.example.QuizSpringBoot2.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.QuizSpringBoot2.Entity.Book;

public class FakeBookDatabase implements BookRepository {

	List<Book> BOOKDATABASE = new ArrayList<>();

	@Override
	public int insertBook(Book book) {
		BOOKDATABASE.add(new Book(book.getId(), book.getName(), book.getDetail()));
		return 1;
	}

	@Override
	public List<Book> getAllBooks() {
		return BOOKDATABASE;
	}

	@Override
	public Book SelectById(int id) {
		Book found = null;
		for (Book book : BOOKDATABASE) {
			if (book.getId() == id) {
				found = book;
			}
		}
		return found;
	}

}

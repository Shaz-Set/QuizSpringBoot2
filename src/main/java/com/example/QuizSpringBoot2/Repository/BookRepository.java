package com.example.QuizSpringBoot2.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.QuizSpringBoot2.Entity.Book;

@Repository
public interface BookRepository {
	
	int insertBook(Book book);

    List<Book> getAllBooks();

    Book SelectById(int id);
}

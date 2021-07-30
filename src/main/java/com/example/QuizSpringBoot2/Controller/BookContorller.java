package com.example.QuizSpringBoot2.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.QuizSpringBoot2.Entity.Book;
import com.example.QuizSpringBoot2.Service.BookService;


@RequestMapping("/api/book")
@RestController
public class BookContorller {
	
	@Autowired
	BookService bookService;

	public BookContorller(BookService bookService) {
		this.bookService = bookService;
	}
	
	@PostMapping
    public void addNewBook(@RequestBody Book book){
        bookService.addBook(book);
    }
    @GetMapping
    public List<Book> returnAllBooks(){
        return bookService.findAllBooks();
    }
    @GetMapping(path = "{id}")
    public Book getBooksByID(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }

}

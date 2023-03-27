package com.mahesh.restapi.Service;

import com.mahesh.restapi.DAO.BooksDB;
import com.mahesh.restapi.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class BookService {

    @Autowired
    BooksDB booksDB;
public String insertBook(Book book) {
    return booksDB.saveBook(book);}

    public List<Book> getAllBooks() {
        return booksDB.getAllBooks();
    }

    public Book getBookById(long id) {
        return booksDB.getBookById(id);
    }

    public String updateBookById(long id, Book book) {
        return booksDB.updateBookById(id,book);
    }

    public String deleteBookById(long id) {
        return booksDB.deleteBookById(id);
    }
}

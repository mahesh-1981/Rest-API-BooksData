package com.mahesh.restapi.DAO;

import com.mahesh.restapi.Model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BooksDB {



    ArrayList<Book> bookList = new ArrayList<>();

    public String saveBook(Book book){
        for (Book books: bookList) {
            if (books.getId() == book.getId()) // getId is a getter
                return  "Not able to store the book because a book already present with given ID";
        }
        bookList.add(book);
        System.out.println("The Book " +  "\"" + book.getTitle()+ "\"" + " Entered by User Stored Successfully" ); // This is for cosole in intelliJ
        return " The  Book "+ "\"" + book.getTitle() + "\""  + " Stored Successfully ";
    }

    public List<Book> getAllBooks() {
        return bookList;
    }

    public Book getBookById(long id) {

        for (Book b:bookList)
            if (id == b.getId())
                return  b;

        return null;
    }

    public String updateBookById(long id, Book book) {

        for (Book old: bookList) {
            if (old.getId() == id){
                old.setTitle(book.getTitle());
                old.setAuthorName(book.getAuthorName());
                old.setCost(book.getCost());

                return "Book Updated Successfully at ID : " + id;
            }
        }

        return "Book Cannot Updated";
    }


    public String deleteBookById(long id) {

        for (Book b:bookList) {
            if (b.getId() == id){
                bookList.remove(b);
                return "Book is removed with ID: " + id;
            }
        }
return "No book found with ID: " + id;
        }
}

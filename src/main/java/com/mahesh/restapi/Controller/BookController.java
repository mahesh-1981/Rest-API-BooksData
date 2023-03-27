package com.mahesh.restapi.Controller;

import com.mahesh.restapi.Model.Book;
import com.mahesh.restapi.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    // "insertBook" is an URI -> Uniform Resource Identifier

    /*
    @PostMapping -> is a Spring MVC annotation used to handle HTTP POST requests.
    It is used to map a method to a specific URL path and HTTP method,
     and to specify how the method should handle the incoming HTTP request.
     */

    // insertBook() -> is a method which takes Posted data from user
    // data -> which is in JSON format and save this data locally

    @Autowired
    BookService bookService;

    //@ApiOperation
    @PostMapping("/insertBook")
    public String insertBook(@RequestBody Book book){

        return bookService.insertBook(book);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/getBookById/{Id}")
    public Book getBookById(@PathVariable long Id){
        return bookService.getBookById(Id);
    }



    @PutMapping("/updateBookById/{Id}")
    public String updateBookById(@PathVariable long Id,@RequestBody Book book){
        return bookService.updateBookById(Id,book);
    }

    @DeleteMapping("/deleteBookById/{Id}")
    public String deleteBookById(@PathVariable long Id){
        return bookService.deleteBookById(Id);
    }
}
